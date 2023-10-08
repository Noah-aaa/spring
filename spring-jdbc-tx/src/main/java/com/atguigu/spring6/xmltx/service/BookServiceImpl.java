package com.atguigu.spring6.xmltx.service;

import com.atguigu.spring6.xmltx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @author longteng
 * @date 2023/9/27 17:05
 **/

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public void buyBook(Integer bookId, Integer userId) {
        // TODO 模拟超时效果
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 根据书籍id查询图书价格
        Integer price = bookDao.getBookPriceByBookId(bookId);
        // 更新图书表库存量-1
        bookDao.updateStock(bookId);
        // 更新用户表用户余额-图书价格
        bookDao.updateBalance(userId,price);

        // 异常
//        System.out.println(1 / 0);
    }
}
