package com.atguigu.spring6.iocxml.auto.controller;


import com.atguigu.spring6.iocxml.auto.service.UserService;
import com.atguigu.spring6.iocxml.auto.service.UserServiceImpl;

/**
 * @author longteng
 * @date 2023/9/25 14:06
 **/
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("controller方法执行了");
        // 调用userService方法
        userService.addUserService();
    }
}
