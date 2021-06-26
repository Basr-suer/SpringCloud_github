package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Basr
 * @date 2021/6/6 20:42
 */

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {
        public static void main(String[] args) {
            SpringApplication.run(ConfigClientMain3355.class, args);
        }
}
