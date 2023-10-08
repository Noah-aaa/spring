package com.atguigu.resources;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author longteng
 * @date 2023/10/6 17:04
 **/
// 访问系统资源
public class FileSystemResouceDemo {
    public static void main(String[] args) {
        loadFileResource("atguigu.txt");
    }
    public static void loadFileResource(String path) {
        // 创建对象
        FileSystemResource resource = new FileSystemResource(path);
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        try {
            InputStream in = resource.getInputStream();
            byte[] b = new byte[1024];
            while(in.read(b) != -1) {
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
