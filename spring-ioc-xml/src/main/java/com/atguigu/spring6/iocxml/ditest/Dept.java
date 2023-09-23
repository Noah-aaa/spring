package com.atguigu.spring6.iocxml.ditest;

import java.util.List;

/**
 * @author longteng
 * @date 2023/9/22 13:08
 **/
// 部门类
public class Dept {
    private List<Emp> empList;
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info() {
        System.out.println("部门名称" + dname);
    }
}
