package com.lzw.customer.apis;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="service-provider")
public interface Hello {
    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
