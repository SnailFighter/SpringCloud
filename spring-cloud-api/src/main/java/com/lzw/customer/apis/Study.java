package com.lzw.customer.apis;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "service-provider")
public interface Study {

    @PostMapping("/study/")
    String study(@RequestBody String name);
}
