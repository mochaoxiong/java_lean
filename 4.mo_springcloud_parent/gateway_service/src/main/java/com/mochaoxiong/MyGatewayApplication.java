package com.mochaoxiong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //作为eureka的客户端
public class MyGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyGatewayApplication.class,args);
    }
}
