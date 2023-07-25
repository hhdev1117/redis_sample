package com.restapi.sample.user.mapper;

import com.restapi.sample.user.dto.UserDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

  public List<UserDto> selectUser(String id);

  public int insertUser(UserDto userDto);

}
