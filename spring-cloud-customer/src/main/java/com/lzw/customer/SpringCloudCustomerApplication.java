package com.lzw.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.lzw.customer.**")
@EnableAutoConfiguration
@EnableFeignClients(basePackages = "com.lzw.customer.**")
@EnableCircuitBreaker
public class SpringCloudCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCustomerApplication.class, args);
	}
}
