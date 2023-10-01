package com.chen.controller;

import com.chen.pojo.User;
import com.chen.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.rmi.RemoteException;

@RestController
public class UserController {


    @Resource
    private UserService userService;

    @GetMapping("/user/{userId}")
    public User queryUserById(@PathVariable Integer userId) {

        try {
            return userService.queryUserById(userId);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }

    }
}
