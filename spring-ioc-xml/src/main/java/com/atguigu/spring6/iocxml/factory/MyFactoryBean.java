package com.atguigu.spring6.iocxml.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author longteng
 * @date 2023/9/25 13:58
 **/
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
