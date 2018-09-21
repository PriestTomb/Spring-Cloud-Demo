package com.example.demo.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {

	@Value("${test.a}")
	String testA;
	
	@RequestMapping("/test")
	public String test() {
		return "get value from config server: " + testA;
	}
	
}
