package com.jsp.EmployeeController;

import com.jsp.EmployeeDto.Employee;
import com.jsp.EmployeeService.EmployeeService;

public class GetById {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = employeeService.getById(1);
		
	System.out.println( employee.getId());
	System.out.println( employee.getEmail());
	System.out.println( employee.getName());
	System.out.println( employee.getPassword());
	System.out.println( employee.getSal());




}
}