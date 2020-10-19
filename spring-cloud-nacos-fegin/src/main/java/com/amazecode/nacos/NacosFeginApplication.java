package com.amazecode.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient// 服务发现
@EnableFeignClients // 引入fegin
public class NacosFeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosFeginApplication.class, args);
    }

}
