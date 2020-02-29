package com.prabhu.practice;

import com.prabhu.practice.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Calendar;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class PracticeApplication {

//	@Bean
//	JedisConnectionFactory jedisConnectionFactory(){
//		return new JedisConnectionFactory();
//	}

//	@Bean
//	RedisTemplate<String, Object> redisTemplate(){
//		RedisTemplate<String, Object> redisTemplate=new RedisTemplate<>();
//		redisTemplate.setConnectionFactory(jedisConnectionFactory());
//
//		redisTemplate.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
//
//		return redisTemplate;
//	}






	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

}
