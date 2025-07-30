package com.tcs.mydemo.service;

import com.tcs.mydemo.entity.EmployeeDTO;
import com.tcs.mydemo.model.Employee;
import com.tcs.mydemo.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplv2 implements EmployeeService{

@Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee emp) {
        //employeeRepository.save(emp);
        EmployeeDTO edto=new EmployeeDTO();
        BeanUtils.copyProperties(emp,edto);
        employeeRepository.save(edto);
        return emp;
    }

    @Override
    public List<Employee> getEmployees() {
        return List.of();
    }

    @Override
    public Employee getEmployeesByID(String id) {
        return null;
    }

    @Override
    public Employee deleteEmployee(String id) {
        return null;
    }
}
