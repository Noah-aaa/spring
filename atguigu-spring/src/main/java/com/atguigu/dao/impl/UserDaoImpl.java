package com.atguigu.dao.impl;

import com.atguigu.anno.Bean;
import com.atguigu.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author longteng
 * @date 2023/9/25 20:06
 **/
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao......");
    }
}
