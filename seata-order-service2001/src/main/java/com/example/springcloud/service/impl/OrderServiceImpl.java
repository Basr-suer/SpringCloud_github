package com.example.springcloud.service.impl;

import com.example.springcloud.dao.OrderDao;
import com.example.springcloud.domain.Order;
import com.example.springcloud.service.AccountService;
import com.example.springcloud.service.OrderService;
import com.example.springcloud.service.StorageService;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Basr
 * @date 2021/6/24 11:59
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------>开始创建订单");
        // 1 新建订单
        orderDao.create(order);

        log.info("------->订单微服务开始调用库存，做扣减count");
        // 2 扣减库存
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("------->订单微服务开始调用库存，做扣减end");

        log.info("------->订单微服务开始调用账户，做扣减money");
        // 3 扣减账户
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("------->订单微服务开始调用账户，做扣减end");

        //4 修改订单的状态 从 0 到 1 ，1代表已经完成
        log.info("------>修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("------>修改订单状态结束");

        log.info("------>下订单结束了");
    }

    @Override
    public void update(Long userId, Integer status) {

    }
}