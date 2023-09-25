package com.atguigu.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * @author longteng
 * @date 2023/9/25 15:56
 **/
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("UserDao实现了");
    }
}
