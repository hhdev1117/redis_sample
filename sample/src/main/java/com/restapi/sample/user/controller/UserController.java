package com.restapi.sample.user.controller;

import com.restapi.sample.user.dto.UserDto;
import com.restapi.sample.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Slf4j
public class UserController {

  private final UserService userService;

  @PostMapping("/add")
  @Operation(summary = "회원등록", description = "회원등록 API입니다.")
  @Parameter(name = "userDTO", description = "입력 파라미터", in = ParameterIn.QUERY)
  public int insertUser(@RequestBody UserDto userDTO) {
    int resultCount = userService.insertUser(userDTO);

    return resultCount;
  }

  @GetMapping("/get")
  @Operation(summary = "회원조회", description = "회원조회 API입니다.")
  public List<UserDto> selectUser(@ModelAttribute UserDto userDTO) {
    List<UserDto> resultList = userService.selectUser(userDTO.getId());

    return null;
  }
}
