package com.atguigu.spring6.iocxml.ditest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author longteng
 * @date 2023/9/22 13:56
 **/
public class TestEmp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = context.getBean("emp2",Emp.class);
        emp.work();
        System.out.println(emp.getEname());
        System.out.println(
                emp.getEname() + emp.getDept().getDname()
        );
    }
}
