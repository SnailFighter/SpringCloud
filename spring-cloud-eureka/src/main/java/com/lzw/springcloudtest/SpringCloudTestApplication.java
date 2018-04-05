package com.lzw.springcloudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTestApplication.class, args);
	}
}
