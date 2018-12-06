package com.example.springboo2mybatis.controller;


import com.example.springboo2mybatis.beans.Test;
import com.example.springboo2mybatis.dao.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping(value = "test")
    public void test() {
        Test test = new Test();
        test.setName("tom");
        test.setAge(15);
        testMapper.insert(test);
    }
}
