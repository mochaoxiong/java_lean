package com.mochaoxiong;


import com.mochoaxiong.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService = act.getBean(ItemsService.class);
        System.out.println(itemsService.findById(2));
    }
}
