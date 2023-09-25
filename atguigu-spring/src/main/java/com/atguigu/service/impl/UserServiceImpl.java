package com.atguigu.service.impl;

import com.atguigu.anno.Bean;
import com.atguigu.anno.Di;
import com.atguigu.dao.UserDao;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author longteng
 * @date 2023/9/25 20:05
 **/
@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userdao;
    public void add(){
        System.out.println("service.....");
        // 调用dao的方法

    }

}
