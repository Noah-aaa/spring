package com.atguigu.spring6.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author longteng
 * @date 2023/9/25 15:34
 **/
@Component(value="user") // <bean id="user" class="..."></bean> 可以指定名字，如果不指定名字，默认使用类名的首字母小写的全名
//    @Repository
//    @Controller
//    @Service
public class User {

}
