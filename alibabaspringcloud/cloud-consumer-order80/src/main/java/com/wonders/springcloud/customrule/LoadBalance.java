package com.wonders.springcloud.customrule;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 自定义负载均衡算法
 * @author ghy
 * @date 2020/9/21
 * @return
 */
public interface LoadBalance {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
