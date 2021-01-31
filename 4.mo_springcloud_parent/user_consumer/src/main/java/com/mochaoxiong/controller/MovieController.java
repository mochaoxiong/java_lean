package com.mochaoxiong.controller;

import com.mochaoxiong.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("movie")
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;


    @HystrixCommand(fallbackMethod = "defaultMethod")
    @GetMapping("look")
    public User look(){
//        User user = restTemplate.getForObject("http://localhost:18081/user/2", User.class);
//        System.out.println("查询用户信息成功\n" + user.toString());
//        return "ok";

//        //获取到名为user_provider_list的微服务列表（同个名称不同ID和端口，也就是集群）
//        List<ServiceInstance> user_provider_list = discoveryClient.getInstances("user_provider");
//        //获取微服务的ip和port
//        ServiceInstance serviceInstance = user_provider_list.get(0);
//        //拼接成url，通过resttemplate模拟get请求
//        User user = restTemplate.getForObject("http://" + serviceInstance.getHost()
//                + ":"+serviceInstance.getPort() + "/user/2", User.class);
        //直接写需要调用的微服务的名称
        User user=restTemplate.getForObject("http://user-provider/user/2", User.class);
        return user;
    }

    //写一个默认方法（发生错误发送默认数据）
    //返回默认的数据必须和熔断方法返回的数据一致
    public User defaultMethod(){
        //创建返回的默认数据
        User user=new User();
        user.setId(123);
        user.setName("默认的数据");
        return user;
    }


}
