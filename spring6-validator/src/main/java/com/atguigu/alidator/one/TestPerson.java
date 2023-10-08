package com.atguigu.alidator.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * @author longteng
 * @date 2023/10/6 19:34
 **/
public class TestPerson {
    public static void main(String[] args) {
        // 创建person对象
        Person person = new Person();
        person.setAge(300);
        person.setName("zhangsan");
        // 创建person对象对应的databinder
        DataBinder binder = new DataBinder(person);
        // 设置校验器
        binder.setValidator(new PersonValidator());
        // 调用方法执行校验
        binder.validate();
        // 输出校验结果
        BindingResult result = binder.getBindingResult();
        System.out.println(result);
    }
}
