package com.example.demo;

import com.example.demo.bean.Person;
import com.example.demo.service.HelloService;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * Spring Boot单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 */
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }
    @Test
    void contextLoads() {

        //日志的级别
        //由低到高 trace debug info warn error
        logger.trace("这是一条跟踪日志");
        logger.debug("这是一条调试日志");
        //Spring Boot默认使用的是info级别的,Root级别
        logger.info("这是一条普通日志");
        logger.warn("这是一条警告日志");
        logger.error("这是一条错误日志");
        System.out.println(person);
    }

}
