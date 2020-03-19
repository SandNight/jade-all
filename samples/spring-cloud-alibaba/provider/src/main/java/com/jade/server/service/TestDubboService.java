package com.jade.server.service;

import com.jade.api.model.User;
import com.jade.api.service.DubboService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Date 2020/3/19 2:49 下午
 * @Author jade
 **/
@Slf4j
@RestController
@RequestMapping("/td")
@Service(version = "1.0.1", protocol = {"dubbo"})
public class TestDubboService implements DubboService {

    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Override
    public User get() {
        Random random = new Random();
        User user = new User();
        user.setId(1L);
        user.setAge(random.nextInt());
        user.setName("jade");
        log.info("user : {}", user);
        return user;
    }
}
