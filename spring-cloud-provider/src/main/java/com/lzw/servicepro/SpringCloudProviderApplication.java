package com.lzw.servicepro;

import com.netflix.discovery.shared.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Configuration
@SpringBootApplication
@ComponentScan(basePackages = "com.lzw.servicepro.**")
@EnableAutoConfiguration
public class SpringCloudProviderApplication {

	public static void main(String[] args) {
		//new SpringApplicationBuilder(SpringCloudProviderApplication.class).web(true).run(args);
		SpringApplication.run(SpringCloudProviderApplication.class, args);
	}


}
