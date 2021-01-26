package com.mochaoxiong;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProvicerApplication {
    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("classpath:spring-provider.xml");
//        让堵塞在这里，即启动容器后不同
        System.in.read();
    }
}
