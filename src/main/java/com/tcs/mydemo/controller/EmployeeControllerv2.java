package com.tcs.mydemo.controller;


import com.tcs.mydemo.model.Employee;
import com.tcs.mydemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeesv2")
public class EmployeeControllerv2 {


    @Autowired
    @Qualifier("employeeServiceImplv2")
    private EmployeeService employeeService;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee e)
    {
      return employeeService.saveEmployee(e);
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
