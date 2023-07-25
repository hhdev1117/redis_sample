package com.restapi.sample.user.service;

import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRedisService {

  @Resource(name="redisTemplate")
  final private RedisTemplate redisTemplate;

  public String selectRedisValue(String key) {

    final ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
    valueOperations.set(key, "password");

    final String value = valueOperations.get(key);

    return value;
  }
}
