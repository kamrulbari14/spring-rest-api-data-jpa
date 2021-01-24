package com.luv2code.springboot.crud.cruddemo.dao;

import com.luv2code.springboot.crud.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
