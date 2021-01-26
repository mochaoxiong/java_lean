package com.mochaoxiong.dao;

import com.mochaoxiong.pojo.User;

public interface UserDao {
    User findById(int id);
}
