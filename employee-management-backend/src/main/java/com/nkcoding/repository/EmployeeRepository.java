package com.nkcoding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nkcoding.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
