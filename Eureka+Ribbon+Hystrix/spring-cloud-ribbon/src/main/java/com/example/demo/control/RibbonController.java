package com.example.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;
import com.example.demo.service.HiService;

@RestController
public class RibbonController {

	@Autowired
	HelloService helloService;
	
	@Autowired
	HiService hiService;
	
	@RequestMapping("/hello")
	public String hello() {
		return helloService.sayHelloByRibbon();
	}
	
	@RequestMapping("/why")
	public String why() {
		return helloService.sayWhyByRibbon();
	}
	
	@RequestMapping("/hi")
	public String hi() {
		return hiService.sayHiByRibbon();
	}
	
}
