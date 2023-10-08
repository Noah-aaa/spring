package com.atguigu.spring6.xmltx.service;

/**
 * @author longteng
 * @date 2023/9/27 18:23
 **/
public interface CheckoutService {
    void checkout(Integer[] bookIds,Integer userId);
}
