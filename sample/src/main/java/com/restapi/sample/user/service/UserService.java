package com.restapi.sample.user.service;

import com.restapi.sample.user.dto.UserDto;
import com.restapi.sample.user.mapper.UserMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserMapper userMapper;

  public int insertUser(UserDto userDto) {
    return userMapper.insertUser(userDto);
  }

  public List<UserDto> selectUser(String id) {
    return userMapper.selectUser(id);
  }
}
