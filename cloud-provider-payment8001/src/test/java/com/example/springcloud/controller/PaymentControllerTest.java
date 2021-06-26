package com.example.springcloud.controller;

import com.example.springcloud.service.PaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Basr
 * @date 2021/4/23 14:07
 */

@SpringBootTest
class PaymentControllerTest {
    @Autowired
    private PaymentService paymentService;

    @Test
    public void get(){
        System.out.println(paymentService.getPaymentById((long) 1));
    }

}