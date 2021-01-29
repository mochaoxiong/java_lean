package com.mochaoxiong.controller;

import com.mochaoxiong.pojo.User;
import com.mochaoxiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //标记并可以传pojo数据
@RequestMapping("/user") //一级路径
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAllUser();
    }
}
