package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpringCloudHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHelloServiceApplication.class, args);
	}
	
	@Value("${server.port}")
	String serverPort;
	
	@RequestMapping("/hello")
	public String hello() {
		return "client say hello, current server port = " + serverPort;
	}
}
