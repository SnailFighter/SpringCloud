package com.lzw.servicepro.rest;

import com.lzw.customer.apis.Study;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class StudyController implements Study{
    @Override
    @PostMapping("/study/")
    public String study(@RequestBody String name){
        return "study "+name;
    }
}
