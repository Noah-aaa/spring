package com.atguigu.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author longteng
 * @date 2023/9/22 12:06
 **/
public class TestBook {
    @Test
    public void testSetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beandi.xml");
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
        System.out.println();

    }
    @Test
    public void testConstrutor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beandi.xml");
        Book book = context.getBean("bookCon",Book.class);
        System.out.println(book);
    }
}
