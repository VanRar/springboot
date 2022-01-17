package org.vanrar.spring.springboot.springboot.dao;

import org.vanrar.spring.springboot.springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployees(int id);

    void deleteEmployee(int id);
}
