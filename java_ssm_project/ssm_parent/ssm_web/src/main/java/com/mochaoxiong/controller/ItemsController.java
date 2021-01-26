package com.mochaoxiong.controller;

import com.mochaoxiong.pojo.Items;
import com.mochoaxiong.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller //如果返回json则使用RestController
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    @GetMapping("/findAll")
    public String findByAll(Model model){
        //model数据模型
        List<Items> items = itemsService.findAll();
        //给数据模型添加数据
        //页面（前端）会自动识别数据模型，并拿到里面的数据
        //因此这叫塞数据给页面（键值对）
        //Model这个类型来源于springframework的ui
        //前端可以通过"${items}" 直接调用（类似于放到了域对象中）
        model.addAttribute("items",items);
        //返回一个参数给视图解析器解析，以便跳转到相应的前端页面
        return "items";

    }
}
