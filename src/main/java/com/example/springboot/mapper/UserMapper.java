package com.example.springboot.mapper;

import com.example.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ljs
 * @description
 * @create 2020/4/13 8:39
 **/
@Mapper
public interface UserMapper {

  User queryById(Integer id);

  Integer queryAllCount();

  String queryUsername(Integer id);

  User queryByName(String username);

  void insertOne(User user);
}
