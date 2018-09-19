package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(
			commandKey = "helloService-sayHello",
			fallbackMethod = "sayHelloDefault")
	public String sayHelloByRibbon() {
		return restTemplate.getForObject("http://HELLO-SERVICE/hello", String.class);
	}

	public String sayHelloDefault() {
		return "hello service error, this is default say hello method";
	}

	@HystrixCommand(
			commandKey = "helloService-sayWhy",
			fallbackMethod = "sayWhyDefault")
	public String sayWhyByRibbon() {
		return restTemplate.getForObject("http://HELLO-SERVICE/why", String.class);
	}

	public String sayWhyDefault() {
		return "hello service error, this is default say why method";
	}
}
