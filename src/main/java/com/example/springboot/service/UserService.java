package com.example.springboot.service;

import com.example.springboot.entity.User;

/**
 * @author ljs
 * @description
 * @create 2020/4/13 8:43
 **/
public interface UserService {

  User queryById(Integer id);

  Integer queryAllCount();

  String queryUsername(Integer id);

  User queryByName(String username);

  void insertOne(User user);
}
