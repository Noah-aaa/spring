package com.atguigu.spring6.tx;

import com.atguigu.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author longteng
 * @date 2023/9/27 17:28
 **/

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class TestBooktx {
    //
    @Autowired
    private BookController bookController;
    @Test
    public void testByBook() {
//        bookController.buyBook(1,1);
        Integer[] bookIds = {1, 2};
        bookController.buyBook(bookIds,1);
        System.out.println("买书了");
    }

}
