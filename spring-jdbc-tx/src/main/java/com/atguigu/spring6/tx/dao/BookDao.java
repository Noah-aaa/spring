package com.atguigu.spring6.tx.dao;

/**
 * @author longteng
 * @date 2023/9/27 17:06
 **/
public interface BookDao {
    Integer getBookPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);
}
