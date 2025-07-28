package com.tcs.mydemo.service;

import com.tcs.mydemo.exception.EmployeeNotFoundException;
import com.tcs.mydemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> empList = new ArrayList<>();

    @Override
    public Employee saveEmployee(Employee e) {
        boolean b = empList.stream().filter(employee -> employee.getEmployeeID().equalsIgnoreCase(e.getEmployeeID())).findAny().isPresent();
        if (b) {
            throw new RuntimeException("id " + e.getEmployeeID() + " is already present");
        }
        empList.add(e);
        return e;
    }

    @Override
    public List<Employee> getEmployees() {
        return empList;
    }

    @Override
    public Employee getEmployeesByID(String id) {


        return empList.stream().filter(employee -> employee.getEmployeeID().equalsIgnoreCase(id))
                .findFirst().orElseThrow(() -> new EmployeeNotFoundException("id " + id + " not present "));

    }

    @Override
    public Employee deleteEmployee(String id) {
        Employee employee1 = empList.stream()
                .filter(employee -> employee.getEmployeeID().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("ID " + id + " is not prsenet"));
        empList.remove(employee1);
        return employee1;

    }
}
