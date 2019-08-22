package com.example.springboo2mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.springboo2mybatis.dao")
public class Springboo2MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboo2MybatisApplication.class, args);
    }

}
