package com.tcs.mydemo.controller;

import com.tcs.mydemo.model.Employee;
import com.tcs.mydemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    @Qualifier("employeeServiceImpl")
    private EmployeeService employeeService;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee emp) {
        return employeeService.saveEmployee(emp);
    }

    @GetMapping
    public List<Employee> getEmployees()
    {
        List<Employee> employees = employeeService.getEmployees();
        return employees;
    }

    @RequestMapping("/{id}")
    public Employee getEmployeeByID(@PathVariable String id)
    {
        Employee employee = employeeService.getEmployeesByID(id);
        return employee;
    }

    @DeleteMapping("/delete/{id}")
    public Employee deleteEmployee(@PathVariable String id)
    {
        return employeeService.deleteEmployee(id);
    }


}
