package com.atguigu.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author longteng
 * @date 2023/10/6 18:34
 **/
public class TestBean {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ResourceBean resourceBean = context.getBean("resourceBean", ResourceBean.class);
        resourceBean.parse();
    }
}
