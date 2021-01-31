package com.mochaoxiong.feign;

import com.mochaoxiong.feign.util.FeignConfig;
import com.mochaoxiong.pojo.User;
import com.mochaoxiong.feign.impl.UserFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//FeignClient声明该接口是一个feign组件
    //name指定微服务的名称（在注册中心的名称）
@FeignClient(name = "user-provider",fallback = UserFeignImpl.class,configuration = FeignConfig.class)
public interface UserFeign {
    @GetMapping("/user/{id}")
    public User findById(@PathVariable(name="id") Integer id);
}
