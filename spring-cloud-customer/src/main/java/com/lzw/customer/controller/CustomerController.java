package com.lzw.customer.controller;

import com.lzw.customer.apis.Hello;
import com.lzw.apis.Study;
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
    public String study(@RequestBody  String name){
        return study.study(name);
    }
}
