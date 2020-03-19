package com.jade.sample.jib.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/1/15 5:50 pm
 * @Author jade
 **/
@RestController
public class TestController {
    /**
     * @return java.lang.String
     * @Description
     * @Date 2020/1/15 6:04 下午
     * @Param []
     **/
    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
