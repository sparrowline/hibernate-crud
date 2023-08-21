package com.jsp.EmployeeService;

import java.util.List;

import com.jsp.EmployeeDao.EmployeeDao;
import com.jsp.EmployeeDto.Employee;


public class EmployeeService {
	
	EmployeeDao employeeDao = new EmployeeDao();
	    public Employee saveEmployee(Employee employee) {
	    	return employeeDao.saveEmployee(employee);
	        
	    }
	   


	public Employee updatEmployee(Employee employee) {
		return  employeeDao.updateEmployee(employee);
		
	}
	
	
	public Employee delete(int id ) {
		return  employeeDao.delete(id);
		
	}
	
	public Employee getById(int id) {
		return employeeDao.getById(id);
	}
	
	
	public List<Employee> getAll(){
		return employeeDao.getAll();
	}
	
	public Employee getUserByEmailAndPassword(String email, String password) {
		Employee employee = employeeDao.getEmployeeByEmailAndPassword(email, password);
		return employee;



	}
	
	public Employee login(String email,int password) {
		return employeeDao.login(email, password);
	}
	
	
}
