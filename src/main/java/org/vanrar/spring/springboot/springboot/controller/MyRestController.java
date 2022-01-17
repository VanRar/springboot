package org.vanrar.spring.springboot.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.vanrar.spring.springboot.springboot.entity.Employee;
import org.vanrar.spring.springboot.springboot.service.EmployeeService;


import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        return allEmployees;
    }

//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable int id) {
//
//        Employee employee = employeeService.getEmployee(id);
//
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addNewEmployee(@RequestBody Employee employee) {
//
//        employeeService.saveEmployee(employee);
//        return employee;
//    }
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//
//        employeeService.saveEmployee(employee);//тк с id, то будет уже обновление
//        return employee;
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public  String deleteEmployee(@PathVariable int id){
//
//
//        employeeService.deleteEmployee(id);
//        return "Employee with id " + id  + " was deleted";
//
//    }

}
