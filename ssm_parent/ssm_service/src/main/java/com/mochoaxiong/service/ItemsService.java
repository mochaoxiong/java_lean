package com.mochoaxiong.service;

import com.mochaoxiong.pojo.Items;

import java.util.List;

public interface ItemsService {

    Items findById(int id);

    List<Items> findAll();
}
