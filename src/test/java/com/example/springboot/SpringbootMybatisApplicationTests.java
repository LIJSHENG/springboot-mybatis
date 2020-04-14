package com.example.springboot;


import lombok.NonNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class SpringbootMybatisApplicationTests {


  @Test
  void contextLoads() {
    System.out.println(environment.getProperty("file"));
  }
  @NonNull
  private static Environment environment;

}
