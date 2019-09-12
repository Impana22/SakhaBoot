package com.Sakha.boot.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Sakha.boot.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository <Employee,Integer> {
	public default Employee getOne(int empId) {
		return null;
	}
	public default Employee save(Employee emp) {
		return null;
	}
	public default List<Employee> findAll(){
		return null;
	}
	public default Object deleteEmployee (int empId) {
		return null;
	}

}
