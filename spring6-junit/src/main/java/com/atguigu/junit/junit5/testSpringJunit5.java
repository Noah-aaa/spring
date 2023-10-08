package com.atguigu.junit.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author longteng
 * @date 2023/9/27 14:53
 **/
@SpringJUnitConfig(locations = "classpath:bean.xml") // 注解 locations指定配置文件的位置
public class testSpringJunit5 {
    // 注入对象
    @Autowired
    private User user;

    // 引入测试方法
    @Test
    public void testUser() {
        System.out.println(user);
        user.run();
    }
}
