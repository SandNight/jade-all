package com.jade.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author jade
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProviderBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderBootstrap.class)
                .properties("nacos.logging.config=classpath:logback-spring.xml")
                .run(args);
    }

}



