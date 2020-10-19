package com.amazecode.nacos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  @Description: 通过Fegin调用接口
 *  @author: zhangyadong
 *  @Date: 2020/10/18 16:07
 *  @version: V1.0
 */
@RestController
public class NacosFeginController {

    @Resource
    NacosServerClient nacosServerClient;

    @GetMapping(value = "first")
    public String echo(){
        return "nacos server + > > >" + nacosServerClient.echo();
    }
}
