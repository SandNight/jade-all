package com.jade.servertest;

import com.jade.sample.jib.JibApplication;
import com.jade.sample.jib.service.ITestService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Author jade
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = JibApplication.class)
public class RpcTest {
    @Reference(version = "1.0", check = false)
    private ITestService testService;


    @Test
    public void test() {
        System.err.println("测试开始*************************！");
        String result = testService.sayHello("ddx" + 1);
        System.err.println(result);
        System.err.println("测试结束*************************！");
    }


}
