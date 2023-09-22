package com.atguigu.spring6;

/**
 * @author longteng
 * @date 2023/9/22 9:03
 **/
public class User {
    private String name;
    private Person person;
    public User(){
        System.out.println("0+无参数构造函数创建了");
    }
    public void add() {
        System.out.println("add....");
    }
}
