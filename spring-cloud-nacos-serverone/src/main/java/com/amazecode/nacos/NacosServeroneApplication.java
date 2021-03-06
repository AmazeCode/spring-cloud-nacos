package com.amazecode.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //服务发现
public class NacosServeroneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServeroneApplication.class, args);
    }

}
