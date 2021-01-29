package com.mochaoxiong.service.impl;

import com.mochaoxiong.dao.UserMapper;
import com.mochaoxiong.pojo.User;
import com.mochaoxiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //dao层不用@component添加到spring容器
    //MyBatis会自动帮忙添加（启动那里会有接口的包扫描，扫描到就放到spring容器中）
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

}
