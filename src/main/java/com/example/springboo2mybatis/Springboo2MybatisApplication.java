package com.example.springboo2mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(value = "com.example.springboo2mybatis.dao")
@EnableCaching
public class Springboo2MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboo2MybatisApplication.class, args);
    }

}
