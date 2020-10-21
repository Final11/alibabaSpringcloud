package com.wonders.springcloud.alibaba.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wonders.springcloud.entities.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息--1--....CustomerBlockHandler");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息--2--....CustomerBlockHandler");
    }
}