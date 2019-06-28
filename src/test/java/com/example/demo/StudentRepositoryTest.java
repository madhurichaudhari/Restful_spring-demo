package com.example.demo;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapping.Passport;
import com.example.demo.mapping.Student;
import com.example.demo.mapping.StudentRepository;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestApplication.class)
public class StudentRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentRepository repository;

	@Autowired
	EntityManager em;



	
  @Test
  @Transactional
	public void retrieveStudentAndAssociatedPassport() {
		Student student = em.find(Student.class, 20001L);
		Passport passport=student.getPassport();
		
		student.setName("Madhuri");
		passport.setNumber("905");
		
		logger.info("passportok -> {}", student);
	   logger.info("studentok -> {}", student.getPassport());
	}
  
  
  @Test
  @Transactional
	public void retrievePassportAndAssociatedStudent() {
	  Passport passport = em.find(Passport.class, 40001L);
		
	   logger.info("Passport::numbert -> {}", passport.getStudent());
	}
	


}
