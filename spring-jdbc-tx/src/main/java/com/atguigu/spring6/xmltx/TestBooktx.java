package com.atguigu.spring6.xmltx;

import com.atguigu.spring6.xmltx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author longteng
 * @date 2023/9/27 17:28
 **/

@SpringJUnitConfig(locations = "classpath:beans-xml.xml")
public class TestBooktx {
    //
    @Autowired
    private BookController bookController;
    @Test
    public void testByBook() {
//        bookController.buyBook(1,1);
        bookController.buyBook(1,1);
        System.out.println("买书了");
    }

}
