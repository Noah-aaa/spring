package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author longteng
 * @date 2023/9/22 11:09
 **/
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 根据id获取对象,id唯一
        User user = (User)context.getBean("user");
        System.out.println(user);
        user.run();
        // 根据类型获取 类型获取只保证配置文件中这种类型是单一的才能进行获取，否则会进行报错
        User user2 = context.getBean(User.class);
        System.out.println(user2);
        user2.run();
        // 根据id和类型获取对象 id和类型可以作为组合键
        User user3 = context.getBean("user",User.class);
        System.out.println(user3);
        user3.run();
    }
}
