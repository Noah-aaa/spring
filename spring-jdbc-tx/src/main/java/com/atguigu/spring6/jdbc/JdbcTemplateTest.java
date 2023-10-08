package com.atguigu.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @author longteng
 * @date 2023/9/27 15:34
 **/
@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加 修改 删除
    @Test
    public void testUpdate() {
        // 添加操作
//        // 第一步编写sql语句
//        String sql = "insert into t_emp values (null,?,?,?);";
//        // 添加操作
//        // 调用jdbcTemplate的方法，传入相关参数
//        int rows = jdbcTemplate.update(sql, "黄富源",20,"女");
//        System.out.println(rows);

        // 修改操作
//        // 第一步编写sql语句
//        String sql = "update t_emp set name=? where id=?";
//        // 调用jdbcTemplate 的方法传入相关参数
//        int rows = jdbcTemplate.update(sql, "禹玉宝", 3);
//        System.out.println(rows);

//        // 删除操作
//        // 第一步编写sql语句
//        String sql = "delete from t_emp where id=?";
//        // 调用jdbcTemplate 的方法传入相关参数
//        int rows = jdbcTemplate.update(sql, 3);
//        System.out.println(rows);
    }

    // 查询 返回对象
    @Test
    public void testSelectObject() {
        // 编写sql语句
        String sql = "select * from t_emp where id=?";
        // 写法一
//        Emp empResult = jdbcTemplate.queryForObject(sql,(rs,rowNum)-> {
//            Emp emp = new Emp();
//            emp.setId(rs.getInt("id"));
//            emp.setAge(rs.getInt("age"));
//            emp.setName(rs.getString("name"));
//            emp.setSex(rs.getString("sex"));
//            return emp;
//        },1);
//        System.out.println(empResult);

        // 写法二
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 4);
        System.out.println(emp.getName());
    }
    // 返回list对象

    @Test
    public void testSelectList() {
        String sql = "select * from t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }

    // 返回单个值
    @Test
    public void testSelectValue() {
        // 第一步编写sql语句
        String sql = "select count(*) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}