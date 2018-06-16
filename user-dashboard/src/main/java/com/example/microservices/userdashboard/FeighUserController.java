package com.example.microservices.userdashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RefreshScope
@RestController
public class FeighUserController {

    private final UserServiceProxy userService;

    @Autowired
    public FeighUserController(UserServiceProxy userService) {
        this.userService = userService;
    }

    @RequestMapping("/dashboard/feign/{myself}")
    public User findMe(@PathVariable Long myself) {
        return userService.findById(myself);
    }

    @RequestMapping("/dashboard/feign/peers")
    public Collection<User> findPeers() {
        return userService.findAll();
    }
}
