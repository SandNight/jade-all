package com.jade.sample.jib.config;

import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date 2019/11/14 7:29 pm
 * @Author jade
 **/
@Configuration
public class IpConfig {

    @Bean
    public InetUtils inetUtils() {
        InetUtilsProperties properties = new InetUtilsProperties();
        List<String> ipList = new ArrayList<>();
        ipList.add("utun.*");
        ipList.add("docker.*");
        properties.setIgnoredInterfaces(ipList);
        return new InetUtils(properties);
    }

}
