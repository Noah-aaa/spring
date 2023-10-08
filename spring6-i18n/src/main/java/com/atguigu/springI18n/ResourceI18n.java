package com.atguigu.springI18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @author longteng
 * @date 2023/10/6 19:11
 **/
public class ResourceI18n {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objs = new Object[]{"atguigu",new Date().toString()};
        String value = context.getMessage("www.atguigu.com", objs, Locale.CHINA);
        System.out.println(value);

    }
}
