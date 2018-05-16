package com.lzw.customer01.apis01.interfaces;


import com.lzw.customer01.apis01.circuit.FallBackHandler;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Order(10)
@FeignClient(name = "service-provider",fallback = FallBackHandler.class)
public interface Study {

    @PostMapping("/study01/")
    String study(@RequestBody String name);

    @PostMapping("/hello01/")
    String hello(@RequestBody String name);
}
