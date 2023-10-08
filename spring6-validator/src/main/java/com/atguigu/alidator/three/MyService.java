package com.atguigu.alidator.three;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author longteng
 * @date 2023/10/6 20:16
 **/
@Service
@Validated
public class MyService {
    public String testMethod (@NotNull @Valid User user) {
        return user.toString();
    }
}
