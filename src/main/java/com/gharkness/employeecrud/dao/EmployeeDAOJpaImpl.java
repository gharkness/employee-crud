package com.gharkness.employeecrud.dao;

import com.gharkness.employeecrud.entity.Employee;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class EmployeeDAOJpaImpl implements EmployeeDAO {
    private EntityManager entityManager;

    @Override
    public List<Employee> findAll() {
        return entityManager.createQuery(" FROM Employee ", Employee.class).getResultList();
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public void deleteById(int id) {
        Employee employee = entityManager.find(Employee.class, id);

        entityManager.remove(employee);
    }
}
