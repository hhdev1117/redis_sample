package com.restapi.sample.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRedisService {

  final private StringRedisTemplate stringRedisTemplate;

  public String selectRedisValue(String key) {

    final ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
    stringStringValueOperations.set(key, "password");

    final String value = stringStringValueOperations.get(key);

    return value;
  }
}
