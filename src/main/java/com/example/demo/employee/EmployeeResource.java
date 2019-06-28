package com.example.demo.employee;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class EmployeeResource {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/emp")
	 public String getEmployeeList(){
		

		System.out.print("hiiiiiiiiiiiiiii");
		//return employeeRepository.findAll();
		return "Hello Test";
		
	}
	
	
	@PostMapping("/createEmployee")
	public ResponseEntity<Object> createStudent(@RequestBody Employee student) {
		Employee savedStudent = employeeRepository.save(student);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedStudent.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	
	

}
