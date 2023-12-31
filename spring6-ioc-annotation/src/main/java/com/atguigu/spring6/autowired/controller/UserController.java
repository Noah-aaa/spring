package com.atguigu.spring6.autowired.controller;

import com.atguigu.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author longteng
 * @date 2023/9/25 15:56
 **/
@Controller
public class UserController {
    // 注入service 第一种方式属性注入
//    @Autowired // 根据类型找到对应对象，完成注入
//    private UserService userService;

    // 第二种方式，set方式注入
//    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
    // 第三种方式，构造方法注入
//    private UserService userService;
//    @Autowired
//    public UserController(UserService userService){
//        this.userService = userService;
//    }

    // 第四种，形参注入

    private UserService userService;
    public UserController(@Autowired UserService userService){
        this.userService = userService;
    }
    //    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    public void add(){
        System.out.println("controller...");
        userService.addUserService();
    }
}
