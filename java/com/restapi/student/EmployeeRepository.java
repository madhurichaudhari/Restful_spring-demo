package com.restapi.student;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository extends JpaRepository<Employee,Long> {
	

}
