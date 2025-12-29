package com.springbootawsdemo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.springbootawsdemo.model.Employee_Master;
import com.springbootawsdemo.services.SpringBootAWSDemoService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping(value="/spring-boot-aws-demo")
public class SpringBootAWSDemoController {
	
	@Autowired
	SpringBootAWSDemoService springBootAWSDemoService;
	
	@GetMapping("/test-aws")
	public String HelloWorldTest() {
		return "Spring Boot Hello World AWS Example. Thanks !!!";
	}
	
	//@PostMapping("/saveEmployeeName/{employeeName}")
	//@PutMapping("/saveEmployeeName/{employeeName}")
	@GetMapping("/saveEmployeeDetails/{employeeId}/{employeeName}/{employeeSalary}/{employeeAge}/{employeeDesignation}/{employeeAddress}/{employeeType}/{employeeGrade}")
	public Employee_Master saveEmployeeDetails(@PathVariable int employeeId, @PathVariable String employeeName, @PathVariable String employeeSalary, @PathVariable int employeeAge,@PathVariable String employeeDesignation,@PathVariable String employeeAddress,@PathVariable String employeeType,@PathVariable String employeeGrade) {
	//public Employee_Master saveEmployeeDetails(@PathVariable int employeeId, @PathVariable String employeeName) {
		return springBootAWSDemoService.saveEmployeeDetails(employeeId,employeeName, employeeSalary, employeeAge, employeeDesignation, employeeAddress, employeeType, employeeGrade);
	}

	@GetMapping("/getEmployeeDetails")
	public Employee_Master getEmployeeDetails() {
		return springBootAWSDemoService.getEmployeeDetails();
	}
	
	
}
