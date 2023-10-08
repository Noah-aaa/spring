package com.atguigu.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author longteng
 * @date 2023/10/6 18:54
 **/
public class ResourceI18n {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages",new Locale("zh","CN"));
        String value1 = bundle.getString("test");
        System.out.println(value1);

        ResourceBundle bundle1 = ResourceBundle.getBundle("messages",new Locale("en","GB"));
        String value2 = bundle1.getString("test");
        System.out.println(value2);

    }
}
