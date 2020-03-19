package com.jade.gateway;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableFeignClients
@ServletComponentScan(basePackages = "com.jade.gateway.api")
public class GatewayBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayBootstrap.class)
                .properties("nacos.logging.config=classpath:logback-spring.xml").run(args);
    }

}
