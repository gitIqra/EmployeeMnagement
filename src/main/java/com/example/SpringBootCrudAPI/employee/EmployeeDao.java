package com.example.SpringBootCrudAPI.employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);
    void delete(int id);
}
