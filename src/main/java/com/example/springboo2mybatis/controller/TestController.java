package com.example.springboo2mybatis.controller;


import com.example.springboo2mybatis.beans.User;
import com.example.springboo2mybatis.service.UserService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
public class TestController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "test/{page}/{size}")
    public List<User> test(@PathVariable int page, @PathVariable int size) {
        log.info("page-----", page);
        return userService.queryAllUser(page, size);
    }
}
