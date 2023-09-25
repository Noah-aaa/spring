package com.atguigu.spring6.iocxml.life;

/**
 * @author longteng
 * @date 2023/9/25 8:27
 **/
public class User {
    private String name;

    public User(){
        System.out.println("1.调用无参数构造，创建bean对象");
    }
    // 初始化的方法
    public void initMethod(){
        System.out.println("4.bean对象初始化，调用指定的初始化函数");
    }
    // 销毁的方法
    public void destroyMethod(){
        System.out.println("5.bean对象销毁，调用指定的销毁方法");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.给bean对象设置属性值");
    }
}
