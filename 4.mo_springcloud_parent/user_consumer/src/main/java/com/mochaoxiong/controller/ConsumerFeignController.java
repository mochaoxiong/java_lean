package com.mochaoxiong.controller;

import com.mochaoxiong.pojo.User;
import com.mochaoxiong.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/feign")
public class ConsumerFeignController {
    @Autowired
    private UserFeign userFeign;

    @RequestMapping(value = "/{id}")
    public User findById(@PathVariable(name = "id")Integer id){
        //1.接收浏览器的请求
        //2.调用feign 发送请求给provider 获取用户数据返回值
        User user = userFeign.findById(id);
        return user;
    }
}
