package com.example.springboo2mybatis.service;

import com.example.springboo2mybatis.beans.User;

import java.util.List;


public interface UserService {

    List<User> queryAllUser(Integer page, Integer size);

    User getUserById(String id);
}
