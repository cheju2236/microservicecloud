package com.king.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * Created by King on 2019/3/24 23:16.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipKIn_StartSpringCoudApp {
    public static void main(String[] args) {
        SpringApplication.run(ZipKIn_StartSpringCoudApp.class, args);
    }
}
