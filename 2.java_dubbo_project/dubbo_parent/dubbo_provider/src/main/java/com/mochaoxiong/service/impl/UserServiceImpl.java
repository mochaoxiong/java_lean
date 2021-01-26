package com.mochaoxiong.service.impl;

import com.mochaoxiong.dao.UserDao;
import com.mochaoxiong.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements com.mochaoxiong.service.UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }
}
