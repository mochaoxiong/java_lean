package com.mochaoxiong.feign.impl;

import com.mochaoxiong.pojo.User;
import com.mochaoxiong.feign.UserFeign;
import org.springframework.stereotype.Component;

@Component //放到容器中管理
public class UserFeignImpl implements UserFeign {
    //这就是降级方法（参数、返回值均与服务提供者方法一致）
    @Override
    public User findById(Integer id) {
        User user = new User();
        user.setId(987);
        user.setName("降级的方法");
        return user;
    }
}
