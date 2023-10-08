package com.atguigu.alidator.two;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

/**
 * @author longteng
 * @date 2023/10/6 19:45
 **/
public class User {
    @NotNull
    private String name;
    @Max(150)
    @Min(0)
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
