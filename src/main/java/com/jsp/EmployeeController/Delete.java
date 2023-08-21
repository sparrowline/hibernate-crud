package com.jsp.EmployeeController;

import com.jsp.EmployeeService.EmployeeService;

public class Delete {
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		employeeService.delete(1);
	}

}
