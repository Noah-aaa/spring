package com.atguigu.prefix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @author longteng
 * @date 2023/10/6 18:38
 **/
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:bean.xml");
        Resource resource = (Resource) context.getResource("atguigu.txt");
        System.out.println(resource.getDescription());
    }
}
