package com.lzw.customer.controller;

import com.lzw.customer.apis.Hello;
import com.lzw.apis.Study;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    Hello hello;

    @Autowired
    Study study;

    @RequestMapping("/hello")
    public String hello(){
        return hello.hello();
    }

    @PostMapping("/study/")
    @HystrixCommand(commandProperties = {
            //可以这么设置
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000"),
            @HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "20"),
    },
            //也可以这样设置
            threadPoolProperties = {
                   /* @HystrixProperty(name = "coreSize", value = "30"),
                    @HystrixProperty(name = "maxQueueSize", value = "101"),
                    @HystrixProperty(name = "keepAliveTimeMinutes", value = "2"),
                    @HystrixProperty(name = "queueSizeRejectionThreshold", value = "15"),*/
                    @HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "20"),
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "10000")
            },fallbackMethod = "defaultStudy")
    public String study(@RequestBody  String name){
        return study.study(name);
    }
    //如果参数与sdudy参数不一致，报错
    public String defaultStudy1(){
        return "study...";
    }

    public String defaultStudy(@RequestBody  String name){
        return "study...";
    }


}
