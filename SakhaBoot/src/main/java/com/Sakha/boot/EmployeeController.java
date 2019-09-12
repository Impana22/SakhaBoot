package com.Sakha.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Sakha.boot.model.Employee;
import com.Sakha.boot.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/employee")
	public String registerEmployee(@ModelAttribute Employee emp, Model m) {
		
		Employee savedEmp=service.save(emp);
		m.addAttribute("emp",savedEmp);
		return "view";
	}
	@GetMapping("/byname")
	public String employeeName(@RequestParam("empName") String name, Model m) {
		Employee savedName=service.getByName(name);
		m.addAttribute("savedName",savedName);
		return "view";
	}

	

}
