package com.atguigu.spring6.xmltx.controller;

import com.atguigu.spring6.xmltx.service.BookService;
import com.atguigu.spring6.xmltx.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author longteng
 * @date 2023/9/27 17:04
 **/
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
//     买书的方法：
    public void buyBook(Integer bookId , Integer userId ) {
        bookService.buyBook(bookId,userId);
    }

}
