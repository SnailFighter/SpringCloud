package com.lzw.customer01.config;

import com.lzw.customer01.apis01.circuit.FallBackHandler;
import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FooConfiguration {
    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }

    /*@Bean
    public FallBackHandler fallBackHandler() {
        return new FallBackHandler();
    }*/


}