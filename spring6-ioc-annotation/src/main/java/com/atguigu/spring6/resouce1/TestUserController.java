package com.atguigu.spring6.resouce1;

import com.atguigu.spring6.resouce1.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author longteng
 * @date 2023/9/25 16:07
 **/

public class TestUserController {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController= context.getBean("myUserController", UserController.class);
        userController.add();
    }
}
