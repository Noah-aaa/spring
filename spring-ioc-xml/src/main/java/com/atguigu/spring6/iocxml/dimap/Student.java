package com.atguigu.spring6.iocxml.dimap;

import java.util.Map;

/**
 * @author longteng
 * @date 2023/9/22 20:48
 **/
public class Student {
    private String sid;
    private String sname;

    private Map<String , Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public void run() {
        System.out.println(sid+"Student类run...."+sname);
        System.out.println(teacherMap);
    }
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
