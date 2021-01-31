package com.mochaoxiong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//启用eureka的client（表示为客户端） 会自动进行注册（需要配置）
@EnableEurekaClient
public class UserProviderApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication01.class,args);
    }
}
