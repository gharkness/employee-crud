package com.gharkness.employeecrud.controller;

import com.gharkness.employeecrud.entity.Employee;
import com.gharkness.employeecrud.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping("/list")
    public String listEmployees(Model model) {

        List<Employee> employeeList = employeeService.findAll();

        model.addAttribute("employees", employeeList);

        return "list-employees";

    }

}
