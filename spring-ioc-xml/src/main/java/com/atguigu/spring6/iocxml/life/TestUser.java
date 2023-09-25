package com.atguigu.spring6.iocxml.life;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author longteng
 * @date 2023/9/25 8:34
 **/
public class TestUser {
    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user",User.class);
        System.out.println("6.bean对象创建完成了可以使用了");
        System.out.println(user);
        user.getName();
        ;
    }

}
