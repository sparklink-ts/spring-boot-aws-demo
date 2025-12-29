package com.springbootawsdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.springbootawsdemo.model.Employee_Master;
import com.springbootawsdemo.repository.SpringBootAWSDemoRepository;

@Service("SpringBootAWSDemoService")
public class SpringBootAWSDemoService {

	@Autowired
	SpringBootAWSDemoRepository springBootAWSDemoRepository;

	public Employee_Master saveEmployeeDetails(int employeeId, String employeeName, String employeeSalary, int employeeAge, String employeeDesignation, String employeeAddress, String employeeType, String employeeGrade) {
		return springBootAWSDemoRepository.saveEmployeeDetails(employeeId, employeeName, employeeSalary, employeeAge, employeeDesignation, employeeAddress, employeeType, employeeGrade);
	}

	public Employee_Master getEmployeeDetails() {
		return springBootAWSDemoRepository.getEmployeeDetails();
	}
	
}
