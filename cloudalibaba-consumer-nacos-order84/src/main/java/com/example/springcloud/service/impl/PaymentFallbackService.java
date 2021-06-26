package com.example.springcloud.service.impl;

import com.example.springcloud.entities.CommonResult;
import com.example.springcloud.entities.Payment;
import com.example.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author Basr
 * @date 2021/6/22 16:34
 */

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回，-----PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
