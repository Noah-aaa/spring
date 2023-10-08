package com.atguigu.spring6.tx.service;

/**
 * @author longteng
 * @date 2023/9/27 17:05
 **/
public interface BookService {
    void buyBook(Integer bookId, Integer userId);
}
