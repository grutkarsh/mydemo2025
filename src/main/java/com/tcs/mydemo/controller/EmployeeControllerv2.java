package com.tcs.mydemo.controller;


import com.tcs.mydemo.model.Employee;
import com.tcs.mydemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
