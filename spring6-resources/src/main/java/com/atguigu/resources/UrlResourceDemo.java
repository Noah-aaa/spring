package com.atguigu.resources;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

/**
 * @author longteng
 * @date 2023/9/28 22:46
 **/
// 演示urlresources 访问网络资源
public class UrlResourceDemo {

    public static void main(String[] args) {
        // http前缀
//        loadUrlResource("http://www.baidu.com");
        // file前缀
        loadUrlResource("file:atguigu.txt");
    }
    // 前缀http、file
    public static void loadUrlResource(String path) {
        // 创建Resource实现类的对象urlResource
        try {
            // 获取资源信息
            UrlResource url = new UrlResource(path);
            System.out.print("filename");
            System.out.println(url.getFilename());
            System.out.println("url地址");
            System.out.println(url.getURI());
            System.out.println("网站描述：");
            System.out.println(url.getDescription());
            System.out.println("网站输入流：");
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
