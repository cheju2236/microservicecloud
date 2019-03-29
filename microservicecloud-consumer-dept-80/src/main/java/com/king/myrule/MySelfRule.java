package com.king.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by King on 2019/3/16 14:39.
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
//        return new RandomRule();
        return new RandomRule_ZY();
    }

}
