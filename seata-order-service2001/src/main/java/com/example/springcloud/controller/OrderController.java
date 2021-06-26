package com.example.springcloud.controller;


import com.example.springcloud.domain.CommonResult;
import com.example.springcloud.domain.Order;
import com.example.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

/**
 * @author Basr
 * @date 2021/6/24 12:04
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
