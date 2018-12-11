package com.example.springboo2mybatis.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class TestController {


    @GetMapping(value = "test/{test}")
    public void test(@PathVariable String test) {
        log.info("test-----",test);
    }
}
