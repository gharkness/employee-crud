package com.gharkness.employeecrud.dao;

import com.gharkness.employeecrud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
