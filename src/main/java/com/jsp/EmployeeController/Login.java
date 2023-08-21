package com.jsp.EmployeeController;

import com.jsp.EmployeeDto.Employee;
import com.jsp.EmployeeService.EmployeeService;

public class Login {
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = employeeService.login("syed0@gmail.com", 0);
		if(employee != null) {
			System.out.println("login successfully ");
		}
		else {
			System.out.println("check id and password");
		}
	}

}
