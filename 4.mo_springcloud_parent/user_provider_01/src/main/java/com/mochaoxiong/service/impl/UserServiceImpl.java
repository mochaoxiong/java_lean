package com.mochaoxiong.service.impl;

import com.mochaoxiong.dao.UserDao;
import com.mochaoxiong.pojo.User;
import com.mochaoxiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        //一定要加get。因为datajpa就这样
        //这个方法是在jpa里面（我们没有在dao设计）
        return userDao.findById(id).get();
    }
}
