package com.wonders.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * Description TODO
 * Author gaohongyu
 * Date 2020/9/16 15:31
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced  //赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
