package com.jade.sample.jib.service.impl;

import com.jade.sample.jib.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/1/16 10:54 ap
 * @Author jade
 **/
@Slf4j
@RestController
@RequestMapping("/testrpc")
@Service(version = "1.0", protocol = {"dubbo"})
public class TestServiceImpl implements ITestService {

    @GetMapping(value = "/say", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Override
    public String sayHello(String name) {
        log.info("hello : {}", name);
        return "hello ：" + name;
    }
}
