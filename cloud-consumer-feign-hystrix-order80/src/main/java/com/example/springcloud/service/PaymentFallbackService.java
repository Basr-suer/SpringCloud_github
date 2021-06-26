package com.example.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Basr
 * @date 2021/5/22 16:02
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String PaymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-PaymentInfo_OK, /(ㄒoㄒ)/~~";
    }

    @Override
    public String PaymentInfo_Timeout(Integer id) {
        return "----PaymentFallbackService fall back-PaymentInfo_Timeout, /(ㄒoㄒ)/~~";
    }
}
