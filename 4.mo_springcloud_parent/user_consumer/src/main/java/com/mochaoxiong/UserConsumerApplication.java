package com.mochaoxiong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//也可以用通用的 EnableDiscoveryClient 服务发现
@EnableCircuitBreaker//开启熔断机制
@EnableFeignClients//启用feign
public class UserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class,args);
    }


    //创建eureka的resttemplate的Bean对象并放到spring容器中
    @Bean
    @LoadBalanced //启动负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
