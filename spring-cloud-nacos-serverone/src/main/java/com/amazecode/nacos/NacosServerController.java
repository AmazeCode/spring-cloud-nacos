package com.amazecode.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @Description: 服务测试Controller
 *  @author: zhangyadong
 *  @Date: 2020/10/18 14:33
 *  @version: V1.0
 */
@RestController
public class NacosServerController{

    @Value("${server.port}")
    Integer port;

    @RequestMapping(value = "/second")
    public String echo(){
        return "Hello Nacos Server Discovery" + port;
    }
}