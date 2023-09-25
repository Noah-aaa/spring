package com.atguigu.spring6.resouce1.controller;

import com.atguigu.spring6.resouce1.service.UserService;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




/**
 * @author longteng
 * @date 2023/9/25 15:56
 **/
@Controller("myUserController")
public class UserController {

    // 按名字注入
//    @Resource(name="myUserService")
//    private UserService userService;
    // 按类型注入
    @Resource
    private UserService userService;
    public void add(){
        System.out.println("controller...");
        userService.addUserService();
    }
}
