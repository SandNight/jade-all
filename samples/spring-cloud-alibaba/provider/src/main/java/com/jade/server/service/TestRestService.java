package com.jade.server.service;

import com.jade.api.service.RestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Service(version = "1.0.1")
@RestController
@Slf4j
public class TestRestService implements RestService {

    @GetMapping(value = "/param", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Override
    public String param(String param) {
        log.info("param : {}", param);
        return param;
    }
}
