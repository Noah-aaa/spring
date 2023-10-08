package com.atguigu.spring6.tx;

import com.atguigu.spring6.tx.config.SpringConfig;
import com.atguigu.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author longteng
 * @date 2023/9/27 18:49
 **/
public class TestAnno {
    @Test
    public void testTxAllAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController bookController = (BookController) context.getBean("bookController");
        Integer[] booksId = {1,2};
        bookController.buyBook(booksId,1);
    }
}
