package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HiService {
	@Autowired
	RestTemplate restTemplate;
	
	public String sayHiByRibbon() {
		return restTemplate.getForObject("http://HI-SERVICE/hi", String.class);
	}
}
