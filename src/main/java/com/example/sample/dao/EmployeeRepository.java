package com.example.sample.dao;

import com.example.sample.model.Employee;

import java.util.Map;

public interface EmployeeRepository {
    Map<String, Object> findOne(int id);

    Employee save(Employee employee);

    int countByName(String name);
}
