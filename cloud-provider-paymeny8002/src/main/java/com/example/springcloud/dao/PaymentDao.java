package com.example.springcloud.dao;

import com.example.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Basr
 * @date 2021/4/22 15:13
 */
@Mapper

public interface PaymentDao{
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
