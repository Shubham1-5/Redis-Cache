package com.shubham.caching.redis.controller;

import com.shubham.caching.redis.entities.User;
import com.shubham.caching.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService ;


    @Cacheable(value = "users", key = "#userId", unless = "#result.followers < 12000")
    @GetMapping(value = "/{userId}")
    public User getUser(@PathVariable String userId) throws InterruptedException {
        return userService.getUserDetails(Long.valueOf(userId));
    }

}
