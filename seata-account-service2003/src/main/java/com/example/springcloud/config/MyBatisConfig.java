package com.example.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Basr
 * @date 2021/6/24 14:15
 */
@Configuration
@MapperScan({"com.example.springcloud.dao"})
public class MyBatisConfig {
}
