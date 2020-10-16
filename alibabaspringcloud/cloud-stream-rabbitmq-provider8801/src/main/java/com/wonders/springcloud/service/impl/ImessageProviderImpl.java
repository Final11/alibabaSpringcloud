package com.wonders.springcloud.service.impl;

import cn.hutool.core.lang.UUID;
import com.wonders.springcloud.service.ImessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName ImessageProviderImpl
 * Description TODO
 * Author gaohongyu
 * Date 2020/10/15 10:22
 * @Version 1.0
 **/
@EnableBinding(Source.class)//定义消息推送的 通道
public class ImessageProviderImpl implements ImessageProvider {

    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send()
    {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial: "+serial);
        return null;
    }
}
