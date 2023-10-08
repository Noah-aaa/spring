package com.atguigu.alidator.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author longteng
 * @date 2023/10/6 20:17
 **/
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService myService = context.getBean(MyService.class);
        User user = new User();
        user.setName("Lucy");
        user.setPhone("17674748738");
        user.setMessage("1123fahdfahod");
        myService.testMethod(user);
    }
}
