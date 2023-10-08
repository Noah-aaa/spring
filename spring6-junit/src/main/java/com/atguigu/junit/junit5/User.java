package com.atguigu.junit.junit5;

import org.apache.logging.log4j.core.tools.picocli.CommandLine;
import org.springframework.stereotype.Component;

/**
 * @author longteng
 * @date 2023/9/27 14:52
 **/
@Component
public class User {
    public void run() {
        System.out.println("user....");
    }
}
