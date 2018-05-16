package com.lzw.servicepro.rest.provider01;

import com.lzw.customer01.apis01.interfaces.Study;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by snail on 18-5-16.
 */
@RestController
public class StudyController01 implements Study {
    @Override
    @PostMapping("/study01/")
    public String study(@RequestBody String name) {
        return "01 study01 "+name;
    }

    @Override
    @PostMapping("/hello01/")
    public String hello(@RequestBody String name) {
        return "01 hello01 "+name;
    }
}
