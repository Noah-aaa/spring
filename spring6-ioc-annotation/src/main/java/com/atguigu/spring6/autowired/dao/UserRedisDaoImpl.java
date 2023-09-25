package com.atguigu.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * @author longteng
 * @date 2023/9/25 16:48
 **/
@Repository
public class UserRedisDaoImpl implements UserDao{
    @Override
    public void addUserDao() {
        System.out.println("userDaoRedis。。。。。");
    }
}
