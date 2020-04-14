package com.example.springboot.service.impl;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ljs
 * @description
 * @create 2020/4/13 8:45
 **/
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public User queryById(Integer id) {
    return userMapper.queryById(id);
  }

  @Override
  public Integer queryAllCount() {
    return userMapper.queryAllCount();
  }

  @Override
  public String queryUsername(Integer id) {
    return userMapper.queryUsername(id);
  }

  @Override
  public User queryByName(String username) {
    return userMapper.queryByName(username);
  }

  @Override
  public void insertOne(User user) {
    userMapper.insertOne(user);
  }
}
