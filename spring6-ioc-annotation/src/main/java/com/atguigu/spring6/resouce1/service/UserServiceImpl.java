package com.atguigu.spring6.resouce1.service;

import com.atguigu.spring6.resouce1.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;



/**
 * @author longteng
 * @date 2023/9/25 15:55
 **/
@Service(value="myUserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao myUserDao;
    @Override
    public void addUserService() {
        System.out.println("UserService实现了");
        myUserDao.addUserDao();
    }
}
