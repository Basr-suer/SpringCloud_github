package com.example.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Basr
 * @date 2021/6/25 2:28
 */
@Mapper
public interface AccountDao{
    void decrease(@Param("userId")Long userId, @Param("money") BigDecimal money);
}