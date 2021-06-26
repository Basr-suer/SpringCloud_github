package com.example.springcloud.service.impl;

import com.example.springcloud.dao.AccountDao;
import com.example.springcloud.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author Basr
 * @date 2021/6/25 2:27
 */
@Service
public class AccountServiceImpl implements AccountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {

        LOGGER.info("-------->account-service中扣减账户余额开始");
        try { TimeUnit.SECONDS.sleep(20); }catch (InterruptedException e){e.printStackTrace();}
        accountDao.decrease(userId,money);
        LOGGER.info("-------->account-service中扣减账户余额结束");

    }
}