package com.restapi.sample.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

  @Schema(description = "ID")
  private String id;

  @Schema(description = "이름")
  private String name;

  @Schema(description = "비밀번호")
  private String password;

}
