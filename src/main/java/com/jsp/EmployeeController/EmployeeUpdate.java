package com.jsp.EmployeeController;

import com.jsp.EmployeeDto.Employee;
import com.jsp.EmployeeService.EmployeeService;

public class EmployeeUpdate {
 public static void main(String[] args) {
	 
			Employee employee = new Employee();
			EmployeeService employeeService = new EmployeeService();
			
			employee.setEmail("syed013@gmail.com");
			employee.setId(1);
			employee.setName("Syedrizwan");
			employee.setPassword(0000);
			employee.setSal(5000);
			
			employeeService.updatEmployee(employee);
			
		}

}

