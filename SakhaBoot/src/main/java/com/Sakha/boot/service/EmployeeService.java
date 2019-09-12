package com.Sakha.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sakha.boot.Repository.EmployeeRepo;
import com.Sakha.boot.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo repo;
	
	public Employee save (Employee emp) {
		return repo.save(emp);
	}
	public Employee getEmployee(int empId) {
		return repo.getOne(empId);
	}
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	public void deleteEmployee(int empId) {
		repo.deleteById(empId);
	}
	public Employee getByName(String Name) {
		return repo.getEmployeeByName(Name);
	}

}
