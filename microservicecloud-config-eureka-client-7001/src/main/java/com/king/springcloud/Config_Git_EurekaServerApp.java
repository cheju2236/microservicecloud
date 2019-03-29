package com.king.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by King on 2019/3/24 16:48.
 */
@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServerApp.class, args);
    }
}
