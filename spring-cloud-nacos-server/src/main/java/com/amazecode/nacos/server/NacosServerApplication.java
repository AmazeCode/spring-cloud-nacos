package com.amazecode.nacos.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *  @Description: 项目主启动类
 *  @author: zhangyadong
 *  @Date: 2020/10/18 14:02
 *  @version: V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //打开服务发现
public class NacosServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServerApplication.class, args);
    }
}
