package com.gharkness.employeecrud.rest;

import com.gharkness.employeecrud.dao.EmployeeDAO;
import com.gharkness.employeecrud.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
