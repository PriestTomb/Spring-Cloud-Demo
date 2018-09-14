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
public class SpringCloudHiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHiServiceApplication.class, args);
	}

	@Value("${server.port}")
	String serverPort;
	
	@RequestMapping("/hi")
	public String hi() {
		return "client say hi, current server port = " + serverPort;
	}
}
