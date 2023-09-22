package com.atguigu.spring6.iocxml.ditest;

/**
 * @author longteng
 * @date 2023/9/22 13:08
 **/
// 部门类
public class Dept {
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void info() {
        System.out.println("部门名称" + dname);
    }
}
