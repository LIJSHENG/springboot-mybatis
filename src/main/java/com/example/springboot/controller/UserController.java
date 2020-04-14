package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户管理")
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @ApiOperation(value = "根据ID查询用户")
  @GetMapping("/queryById")
  public User queryById(Integer id){
    return userService.queryById(id);
  }

  @ApiOperation(value = "查询用户总数")
  @GetMapping("/queryAllCount")
  public Integer queryAllCount(){
    return userService.queryAllCount();
  }

  @ApiOperation(value = "根据用户名查询")
  @GetMapping("/queryByName")
  public User queryByName(String username){
    return userService.queryByName(username);
  }

  @ApiOperation(value = "根据ID查询用户名")
  @GetMapping("/queryUsername")
  public String queryUsername(Integer id){
    return userService.queryUsername(id);
  }

  @ApiOperation(value = "添加用户")
  @PostMapping("/insertOne")
  public User insertOne(@RequestBody User user){
    userService.insertOne(user);
    return user;
  }
}
