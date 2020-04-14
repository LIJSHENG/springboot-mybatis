package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringbootMybatisApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootMybatisApplication.class, args);
  }

}
