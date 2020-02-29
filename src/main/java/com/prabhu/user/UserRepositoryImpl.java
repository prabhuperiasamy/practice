package com.prabhu.user;

import com.prabhu.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {

@Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private HashOperations hashOperations;

    public UserRepositoryImpl(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public String save(User user) {
        hashOperations.put("USER",user.getId(),user);
        return "saved Succeesfully";
    }

    @Override
    public Map<String, User> findAll() {
        return hashOperations.entries("USER");
    }

    @Override
    public User findById(String id) {
        return (User) hashOperations.get("USER",id);
    }

    @Override
    public String update(User user) {
       save(user);
        return "updated Succeesfully";
    }

    @Override
    public String  delete(String id) {
        hashOperations.delete("USER", id);
        return "deleted Succeesfully";
    }
}
