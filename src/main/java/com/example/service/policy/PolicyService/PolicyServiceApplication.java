package com.example.service.policy.PolicyService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class PolicyServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PolicyServiceApplication.class, args);
	}
}
