package com.jsp.EmployeeController;

import java.util.List;

import com.jsp.EmployeeDto.Employee;
import com.jsp.EmployeeService.EmployeeService;

public class GetAll {
	
		public static void main(String[] args) {
			EmployeeService employeeService = new EmployeeService();
			 List<Employee> list = employeeService.getAll();
			
		for(Employee e : list) {
			System.out.println( e.getId());
			System.out.println( e.getEmail());
			System.out.println( e.getName());
			System.out.println( e.getPassword());
			System.out.println( e.getSal());
			
		}




	}
	}

