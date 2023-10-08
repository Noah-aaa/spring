package com.atguigu.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author longteng
 * @date 2023/10/6 17:56
 **/
public class ResourceLoaderDemo {
    @Test
    public void demo1() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        Resource resource = context.getResource("atguigu.txt");
        System.out.println(resource.getFilename());
        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        while (in.read(b) != -1) {
            System.out.println(new String(b));
        }
    }
    @Test
    public void demo2() {
        ApplicationContext context = new FileSystemXmlApplicationContext();
        Resource resource = context.getResource("atguigu.txt");
        System.out.println(resource.getFilename());
        try {
            InputStream in = resource.getInputStream();
            byte[] b = new byte[1024];
            while(in.read(b) != -1){
                System.out.println(new String(b));
            }
            System.out.println(resource.getFile());
        } catch (Exception e) {
            System.out.println(e+"错误了");
        } finally {
            System.out.println("结束");
        }
    }
}
