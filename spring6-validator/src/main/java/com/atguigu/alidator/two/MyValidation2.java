package com.atguigu.alidator.two;

import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindException;

import java.util.List;

/**
 * @author longteng
 * @date 2023/10/6 19:54
 **/
@Service
public class MyValidation2 {
    @Autowired
    private Validator validator;
    public boolean validatorByUserTwo(User user) {
        BindException bindException = new BindException(user,user.getName());
        validator.validate(user,bindException);
        List<ObjectError> allErrors = bindException.getAllErrors();
        System.out.println(allErrors);
        return bindException.hasErrors();
    }
}
