package com.atguigu.alidator.four;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * @author longteng
 * @date 2023/10/6 20:25
 **/
public class CannotBlankValidation implements ConstraintValidator<CannotBlank,String> {
    @Override
    public void initialize(CannotBlank constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if(value != null && value.contains(" ")){
            // 获取默认提示信息
            String defalutConstraintMessageTemplate = context.getDefaultConstraintMessageTemplate();
            System.out.println("default message:" +defalutConstraintMessageTemplate);
            // 禁用默认提示信息
            context.disableDefaultConstraintViolation();
            // 设置提示语
            context.buildConstraintViolationWithTemplate("can not containts blank").addConstraintViolation();
            return false;
        }
        return true;
    }
}
