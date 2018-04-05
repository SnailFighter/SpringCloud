package com.lzw.servicepro.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class HelloController {

    @RequestMapping(value = "hello")
    public String hello(){
        return "你好！";
    }
}
