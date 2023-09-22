package com.atguigu.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author longteng
 * @date 2023/9/22 9:11
 **/
public class TestUser {
    // 创建对象 Logger对象(用于日志输出)
    private Logger logger = LoggerFactory.getLogger("TestUser.class");
    @Test
    public void testUserObject() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 获取User类对象
        User user = (User)context.getBean("user");
        System.out.println(user);
        // 调用User类里面的方法
        user.add();
        // 手动写日志
        logger.info("执行调用成功了");
    }
    // 反射创建对象
    @Test
    public void testUserObject1() throws Exception {
        // 获取类Class对象
        Class clazz = Class.forName("com.atguigu.spring6.User");
        // 调用方法创建对象
        User user =  (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }

}
