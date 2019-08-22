package com.example.springboo2mybatis.service.impl;

import com.example.springboo2mybatis.beans.User;
import com.example.springboo2mybatis.dao.UserMapper;
import com.example.springboo2mybatis.service.UserService;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUser(Integer page, Integer size) {
        //PageHelper.startPage(page,size) 下面紧跟查询
        PageHelper.startPage(page, size);
        List<User> userList = userMapper.queryAllUser(page, size);
        //PageInfo<User> pageInfo = new PageInfo<>();
        return userList;
    }

    @Override
    @Cacheable(cacheNames = "user")
    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(Integer.parseInt(id));
    }
}
