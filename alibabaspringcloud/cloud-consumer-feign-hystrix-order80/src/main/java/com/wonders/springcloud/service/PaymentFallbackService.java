package com.wonders.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements OrderHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fdfsd back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-jskfsjdkfjie , (┬＿┬)";
    }
}
 