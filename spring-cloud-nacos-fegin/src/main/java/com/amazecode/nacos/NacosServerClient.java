package com.amazecode.nacos;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  @Description: client
 *  @author: zhangyadong
 *  @Date: 2020/10/18 16:04
 *  @version: V1.0
 */
@FeignClient("nacos-server")
public interface NacosServerClient {

    @RequestMapping(value = "/second")
    String echo();
}
