package com.example.sample.model;

import com.example.sample.dao.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
@RequiredArgsConstructor
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> findOne(int id) {
        String query = "Select * from Employee where id = ?";
        return jdbcTemplate.queryForMap(query, id);
    }

    @Override
    public Employee save(Employee employee) {
        return null;
    }

    @Override
    public int countByName(String name) {
        return 0;
    }
}
