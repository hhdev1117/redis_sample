package com.restapi.sample.user.service;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRedisService {

  @Resource(name="redisTemplate")
  final private RedisTemplate<String, Object> redisTemplate;

  public String selectRedisValue(String key) {

    final ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
    valueOperations.set(key, "password");

    return (String) valueOperations.get(key);
  }
}
