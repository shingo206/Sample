package com.example.sample.trySpring;

import com.example.sample.model.Employee;
import com.example.sample.model.EmployeeRepositoryImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final EmployeeRepositoryImpl repository;
    public Employee findOne(int id) {
        Map<String, Object> map = repository.findOne(id);

        Employee employee = new Employee();
        employee.setId((Long) map.get("id"));
        employee.setName((String) map.get("name"));
        employee.setAge((int) map.get("age"));
        return employee;
    }
}
