package com.atguigu.spring6.xmltx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author longteng
 * @date 2023/9/27 18:24
 **/
@Service
public class CheckoutImpl implements CheckoutService {
    @Autowired
    private BookService bookService;
    @Transactional
    @Override
    public void checkout(Integer[] bookIds, Integer userId) {
        for(Integer bookId : bookIds){
            bookService.buyBook(bookId,userId);
        }

    }
}
