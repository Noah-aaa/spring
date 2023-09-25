package com.atguigu.spring6.resouce1;

import com.atguigu.spring6.config.SpringConfig;
import com.atguigu.spring6.resouce1.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author longteng
 * @date 2023/9/25 16:07
 **/

public class TestUserControllerAnno {
    public static void main(String[] args) {
        // 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController= context.getBean("myUserController", UserController.class);
        userController.add();
    }
}
