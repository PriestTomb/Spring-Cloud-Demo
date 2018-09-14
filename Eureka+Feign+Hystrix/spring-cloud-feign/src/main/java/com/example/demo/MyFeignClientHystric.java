package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MyFeignClientHystric implements MyFeignClient {

	@Override
	public String sayHelloFromFeign() {
		return "error occurred, hystric succ";
	}

}
