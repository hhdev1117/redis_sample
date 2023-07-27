package com.restapi.sample.user.service;

import static org.junit.jupiter.api.Assertions.*;

import com.restapi.sample.user.dto.UserDto;
import com.restapi.sample.user.mapper.UserMapper;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

  @InjectMocks
  private UserService userService;

  @Mock
  private UserMapper userMapper;

  @Test
  @DisplayName("insert Test !!")
  void insertUser() {
    try {
      List<UserDto> list = userService.selectUser("heehae1117");
    } catch (Exception e) {
      e.printStackTrace();
    }

    //System.out.println(list.get(0).getName());

  }
}