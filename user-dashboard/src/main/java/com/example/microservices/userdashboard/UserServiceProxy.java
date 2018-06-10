package com.example.microservices.userdashboard;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@FeignClient(name = "Users")
@RibbonClient(name = "Users")
public interface UserServiceProxy {

    @RequestMapping("/users/{id}")
    User findById(@PathVariable(value = "id") Long id);

    @RequestMapping("/users")
    Collection<User> findAll();

}
