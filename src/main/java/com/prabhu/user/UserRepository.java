package com.prabhu.user;

import com.prabhu.user.User;

import java.util.Map;

public interface UserRepository {
    String save(User user);
    Map<String, User> findAll();
    User findById(String id);
    String update(User user);
    String delete(String id);
}
