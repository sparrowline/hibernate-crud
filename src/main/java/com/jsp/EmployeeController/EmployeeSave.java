package com.jsp.EmployeeController;

import com.jsp.EmployeeDto.Employee;
import com.jsp.EmployeeService.EmployeeService;

public class EmployeeSave {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		EmployeeService employeeService = new EmployeeService();
		
		employee.setEmail("syed01@gmail.com");
		employee.setId(3);
		employee.setName("Syed1");
		employee.setPassword(0000);
		employee.setSal(5000);
		
		employeeService.saveEmployee(employee);
		
	}

	

}
