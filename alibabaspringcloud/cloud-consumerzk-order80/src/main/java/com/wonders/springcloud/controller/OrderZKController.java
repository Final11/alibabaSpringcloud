package com.wonders.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderZKController
 * Description TODO
 * Author gaohongyu
 * Date 2020/9/18 11:00
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderZKController {
    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/consumer/payment/zk")
    public String payment (){
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
    }

}
