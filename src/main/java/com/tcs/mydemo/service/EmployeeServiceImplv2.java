package com.tcs.mydemo.service;

import com.tcs.mydemo.entity.EmployeeEntity;
import com.tcs.mydemo.model.Employee;
import com.tcs.mydemo.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplv2 implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee emp) {
        //employeeRepository.save(emp);
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(emp, employeeEntity);
        employeeRepository.save(employeeEntity);
        return emp;
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> emplist = new ArrayList<>();
        List<EmployeeEntity> all = employeeRepository.findAll();
        for (EmployeeEntity employeeEntity : all) {
            Employee e = new Employee();
            BeanUtils.copyProperties(employeeEntity, e);
            emplist.add(e);
        }
        return emplist;
    }

    @Override
    public Employee getEmployeesByID(String id) {
        Employee e = new Employee();
        EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
        BeanUtils.copyProperties(employeeEntity, e);
        return e;
    }

    @Override
    public Employee deleteEmployee(String id) {

        employeeRepository.deleteById(id);
        return null;
    }
}
