package com.example.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Basr
 * @date 2021/6/25 2:04
 */
public interface AccountService {

    void decrease(@RequestParam("userId")Long userId, @RequestParam("money") BigDecimal money);
}