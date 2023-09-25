package com.atguigu.spring6.autowired.service;

import com.atguigu.spring6.autowired.dao.UserDao;
import com.atguigu.spring6.autowired.dao.UserDaoImpl;
import org.junit.jupiter.api.AfterAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author longteng
 * @date 2023/9/25 15:55
 **/
@Service
public class UserServiceImpl implements UserService{
//    @Autowired // 属性注入 第一种方式
//    private UserDao userDao;

    // 第二种方式set方式注入
//    private UserDao userDao;
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    // 第三种方法 构造方法注入

//    private UserDao userDao;
//    @Autowired
//    public UserServiceImpl(UserDao userDao){
//        this.userDao = userDao;
//    }
    // 第四种方法，形参注入
//    private UserDao userDao;
//    public UserServiceImpl(@Autowired UserDao userDao){
//        this.userDao = userDao;
//    }
    // 最后一种方式，名称注入
    @Autowired
    @Qualifier(value = "userRedisDaoImpl") // 类的首字母小写
    private UserDao userDao;
    @Override
    public void addUserService() {
        System.out.println("UserService实现了");
        userDao.addUserDao();
    }
}
