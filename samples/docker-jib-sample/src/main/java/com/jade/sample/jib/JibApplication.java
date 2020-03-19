package com.jade.sample.jib;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author jade
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableAsync
public class JibApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(JibApplication.class)
                .properties("nacos.logging.config=classpath:logback-spring.xml")
                .run(args);
    }

}



