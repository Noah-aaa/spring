package com.atguigu.spring6.iocxml.bean;

/**
 * @author longteng
 * @date 2023/9/22 11:34
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void run() {
        System.out.println("userDaoImpl run....");
    }
}
