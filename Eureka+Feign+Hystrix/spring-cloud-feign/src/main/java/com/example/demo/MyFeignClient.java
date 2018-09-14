package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "hello-service",fallback = MyFeignClientHystric.class)
public interface MyFeignClient {

	@RequestMapping("/hello")
	String sayHelloFromFeign();
	
}
