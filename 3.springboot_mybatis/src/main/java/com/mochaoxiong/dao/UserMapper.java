package com.mochaoxiong.dao;

import com.mochaoxiong.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> findAllUser();
}
