package com.springbootawsdemo.repository;

import org.springframework.stereotype.Repository;
import com.springbootawsdemo.model.Employee_Master;


@Repository("SpringBootAWSDemoRepository")
public class SpringBootAWSDemoRepository {

	private static Employee_Master employeeMaster = new Employee_Master();
	
	public Employee_Master saveEmployeeDetails(int employeeId, String employeeName, String employeeSalary, int employeeAge, String employeeDesignation, String employeeAddress, String employeeType, String employeeGrade) {
		employeeMaster.setEmployeeId(employeeId);
		employeeMaster.setEmployeeName(employeeName);
		employeeMaster.setEmployeeSalary(employeeSalary);
		employeeMaster.setEmployeeAge(employeeAge);
		employeeMaster.setEmployeeDesignation(employeeDesignation);
		employeeMaster.setEmployeeAddress(employeeAddress);
		employeeMaster.setEmployeeType(employeeType);
		employeeMaster.setEmployeeGrade(employeeGrade);
				
		return employeeMaster;
	}

	public Employee_Master getEmployeeDetails() {
		return employeeMaster;
	}


}
