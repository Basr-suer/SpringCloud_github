package com.example.springcloud.service.impl;

import com.example.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Basr
 * @date 2021/6/9 15:56
 */

@EnableBinding(Source.class)  // 不是和controller打交道的service,而是发送消息的推送服务类
public class IMessageProviderImpl implements IMessageProvider {
    //上面是自定义的接口
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("******serial: " + serial);
        return null;
    }
}
