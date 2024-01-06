package com.springboot.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.first-application
 * 启动SpringBoot项目的主入口程序
 *
 *
 */
@SpringBootApplication //这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
