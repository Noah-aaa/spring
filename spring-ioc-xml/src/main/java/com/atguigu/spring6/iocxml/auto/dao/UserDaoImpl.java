package com.atguigu.spring6.iocxml.auto.dao;

/**
 * @author longteng
 * @date 2023/9/25 14:07
 **/
public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("userDao里面的方法实现了");
    }
}
