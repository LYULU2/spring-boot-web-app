package com.luerlyu.myapp.service;

import java.util.List;

import com.luerlyu.myapp.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
