package com.wonders.ribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MySelfRibbonRule
 * Description TODO
 * Author gaohongyu
 * Date 2020/9/21 10:53
 * @Version 1.0
 **/
@Configuration
public class MySelfRibbonRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }


}
