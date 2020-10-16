package com.wonders.springcloud.service.impl;

import com.wonders.springcloud.dao.PaymentDao;
import com.wonders.springcloud.entities.Payment;
import com.wonders.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * Description TODO
 * Author gaohongyu
 * Date 2020/9/14 17:13
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}
