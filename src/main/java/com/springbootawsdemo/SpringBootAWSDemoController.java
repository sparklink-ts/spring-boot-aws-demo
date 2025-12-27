package com.springbootawsdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value="/spring-boot-aws-demo")
public class SpringBootAWSDemoController {
	
	@GetMapping("test-aws")
	public String HelloWorldTest() {
		return "Spring Boot Hello World AWS Example. Thanks !!!";
	}

}
