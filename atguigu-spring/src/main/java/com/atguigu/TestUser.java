package com.atguigu;

import com.atguigu.Bean.AnnotationApplicationContext;
import com.atguigu.Bean.ApplicationContext;
import com.atguigu.service.UserService;

/**
 * @author longteng
 * @date 2023/9/25 21:40
 **/
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationApplicationContext("com.atguigu");
        UserService userService = (UserService) context.getBean(UserService.class);
        userService.add();
    }
}
