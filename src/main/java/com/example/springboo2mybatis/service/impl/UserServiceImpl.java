package com.example.springboo2mybatis.service.impl;

import com.example.springboo2mybatis.beans.User;
import com.example.springboo2mybatis.dao.UserMapper;
import com.example.springboo2mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser(Integer page, Integer size) {
        return null;
    }
}
