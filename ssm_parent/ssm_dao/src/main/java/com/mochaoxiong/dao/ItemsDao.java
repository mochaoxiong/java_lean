package com.mochaoxiong.dao;

import com.mochaoxiong.pojo.Items;

import java.util.List;

public interface ItemsDao {
    Items findById(int id);

    List<Items> findAll();
}
