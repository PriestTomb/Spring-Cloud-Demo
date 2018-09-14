package com.example.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.MyFeignClient;

@RestController
public class FeignController {

	@Autowired
	MyFeignClient myFeignClient;
	
	@RequestMapping("hello")
	public String hello() {
		return myFeignClient.sayHelloFromFeign();
	}
}
