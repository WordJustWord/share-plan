package com.pigmo.sp.userservice;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.pigmo.sp.userservice.service")
public class UserServicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServicesApplication.class,args);
    }
}
