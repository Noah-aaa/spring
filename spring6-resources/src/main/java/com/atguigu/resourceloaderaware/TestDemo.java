package com.atguigu.resourceloaderaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ResourceLoader;

/**
 * @author longteng
 * @date 2023/10/6 18:18
 **/
public class TestDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TestBean testBean= context.getBean("testBean",TestBean.class);
        ResourceLoader resourceLoader = testBean.getResourceLoader();

        System.out.println(context == resourceLoader);
    }
}
