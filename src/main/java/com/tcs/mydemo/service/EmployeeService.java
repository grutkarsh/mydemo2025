package com.tcs.mydemo.service;

import com.tcs.mydemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee saveEmployee(Employee emp);

    List<Employee> getEmployees();

    Employee getEmployeesByID(String id);
}
