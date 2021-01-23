package com.mochoaxiong.service.impl;

import com.mochaoxiong.dao.ItemsDao;
import com.mochaoxiong.pojo.Items;
import com.mochoaxiong.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    //ssm_dao层已经在核心容器中创建 itemsDao，因此会自动匹配
    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(int id) {
        return itemsDao.findById(id);
    }

    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }
}
