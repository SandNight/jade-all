package com.jade.sample.jib.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author jade
 * @Date 2019-08-02 18:33
 **/
@Configuration
public class SentinelAspectConfig {
    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }
}
