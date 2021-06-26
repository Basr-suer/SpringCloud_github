package com.example.springcloud.service;


import com.example.springcloud.domain.Order;

/**
 * @author Basr
 * @date 2021/6/24 11:58
 */

public interface OrderService {
    void create(Order order);
    void update(Long userId, Integer status);
}