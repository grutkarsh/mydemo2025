package com.tcs.mydemo.service;

import com.tcs.mydemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> empList=new ArrayList<>();
    @Override
    public Employee saveEmployee(Employee e) {
        empList.add(e);
        return e;
    }

    @Override
    public List<Employee> getEmployees() {
        return empList;
    }

    @Override
    public Employee getEmployeesByID(String id) {



        return empList.stream().filter(employee -> employee.getEmployeeID().equalsIgnoreCase(id)).findFirst().get();

    }
}
