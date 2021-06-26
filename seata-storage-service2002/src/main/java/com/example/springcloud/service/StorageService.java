package com.example.springcloud.service;

/**
 * @author Basr
 * @date 2021/6/24 17:23
 */
public interface StorageService {
    void decrease(Long productId,Integer count);
}