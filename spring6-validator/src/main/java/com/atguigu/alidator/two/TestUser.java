package com.atguigu.alidator.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author longteng
 * @date 2023/10/6 20:00
 **/
public class TestUser {
    @Test
    public void testVlalidationOne() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation1 myValidation1 = context.getBean(MyValidation1.class);
        User user = new User();
        user.setName("zhangsan");
        user.setAge(11);
        boolean message = myValidation1.validatorByUser(user);
        System.out.println(message);
    }
    @Test
    public void testVlalidationTwo() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyValidation2 myValidation2 = context.getBean(MyValidation2.class);
        User user = new User();
        user.setName("李四");
        user.setAge(2000);
        boolean message = myValidation2.validatorByUserTwo(user);
        System.out.println(message);
    }


}
