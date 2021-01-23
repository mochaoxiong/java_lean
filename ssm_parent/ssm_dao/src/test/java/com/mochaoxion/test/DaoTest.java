package com.mochaoxion.test;


import com.mochaoxiong.dao.ItemsDao;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = act.getBean(ItemsDao.class);
        System.out.println(itemsDao.findById(1));
    }
}
