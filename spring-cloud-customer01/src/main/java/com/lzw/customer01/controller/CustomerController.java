package com.lzw.customer01.controller;


import com.lzw.customer01.apis01.interfaces.Study;
import com.lzw.customer01.apis.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    Hello hello;

    @Autowired
    Study study;


    @GetMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/hello/")
    public String hello(){
        return hello.hello();
    }

    @PostMapping("/study/")
    public String study(@RequestBody String name){
        return study.study(name);
    }

}
