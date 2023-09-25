package com.atguigu.spring6.resouce1.dao;

import org.springframework.stereotype.Repository;

/**
 * @author longteng
 * @date 2023/9/25 16:48
 **/
@Repository("myUserRedisDao")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("userDaoRedis。。。。。");
    }
}
