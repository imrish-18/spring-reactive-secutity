package com.spring.security;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.model.Employee;

/**
 * The Interface EmployeeRepository.
 */
@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee,String> {

}
