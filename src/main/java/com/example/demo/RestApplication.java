package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.mapping.StudentRepository;

@SpringBootApplication
public class RestApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
		
		
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		studentRepository.saveStudentWithPassport();
		// TODO Auto-generated method stub
		
	}
}
