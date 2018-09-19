package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MyFeignClientHystric implements MyFeignClient {

	@Override
	public String sayHelloByFeign() {
		return "hello error occurred, hystrix succ";
	}

	@Override
	public String sayWhyByFeign() {
		return "why service error, now hystrix running";
	}

	public static void main(String[] args) {
		System.out.println(MyFeignClient.class.getSimpleName());
	}
	
}
