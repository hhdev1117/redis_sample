package com.restapi.sample.conf;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.redis.serializer.RedisSerializer;

@Getter
@Configuration
@RequiredArgsConstructor
@EnableRedisRepositories // redis repo 활성화
public class RedisConfig {

  @Value("${spring.cache.redis.host}")
  private String host;

  @Value("${spring.cache.redis.port}")
  private int port;

  /*
  * Redis를 연결
  * */
  @Bean
  public RedisConnectionFactory redisConnectionFactory(){
    return new LettuceConnectionFactory(host, port);
  }

  /*
  * RedisConnection에서 넘어온 byte 값 객체 직렬화
  * */
  @Bean
  public RedisTemplate<String,Object> redisTemplate(){
    RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
    redisTemplate.setKeySerializer(RedisSerializer.string());
    redisTemplate.setValueSerializer(RedisSerializer.string());
    redisTemplate.setHashKeySerializer(RedisSerializer.string());
    redisTemplate.setHashValueSerializer(RedisSerializer.string());
    redisTemplate.setConnectionFactory(this.redisConnectionFactory());
    return redisTemplate;
  }
}
