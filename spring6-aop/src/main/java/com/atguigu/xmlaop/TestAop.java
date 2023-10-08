package com.atguigu.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author longteng
 * @date 2023/9/26 17:49
 **/
public class TestAop {
    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(2,3);
    }
}
