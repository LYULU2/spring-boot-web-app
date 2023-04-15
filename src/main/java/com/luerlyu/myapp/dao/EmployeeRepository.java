package com.luerlyu.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luerlyu.myapp.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//add method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
	
}
