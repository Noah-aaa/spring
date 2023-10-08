package com.atguigu.alidator.two;

import jakarta.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.validation.Validator;
import java.util.Set;

/**
 * @author longteng
 * @date 2023/10/6 19:46
 **/
@Service
public class MyValidation1 {
    @Autowired
    private Validator validator;
    public boolean validatorByUser (User user) {
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        return validate.isEmpty();
    }
}
