package com.example.springboot.entity;

import lombok.Data;

/**
 * @author ljs
 * @description 用户类
 * @create 2020/4/11 16:39
 **/
@Data
public class User {

  private Integer id;

  private String username;

  private String password;

  private String sex;

  private String email;
}
