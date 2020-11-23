package com.example.demo;

import com.example.demo.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * @SpringBootApplication 来标注一个程序类，说明这是一个 Spring Boot 应用
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoApplication {

    public static void main(String[] args) {
        //启动Spring应用
        SpringApplication.run(DemoApplication.class, args);
    }

}
