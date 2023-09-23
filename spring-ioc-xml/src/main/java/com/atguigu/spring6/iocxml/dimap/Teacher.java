package com.atguigu.spring6.iocxml.dimap;

/**
 * @author longteng
 * @date 2023/9/22 20:48
 **/
public class Teacher {
    private String tid;
    private String tname;

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
