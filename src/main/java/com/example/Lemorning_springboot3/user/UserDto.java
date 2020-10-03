package com.example.Lemorning_springboot3.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
  private String email;
  private String password;

  private String auth;
}