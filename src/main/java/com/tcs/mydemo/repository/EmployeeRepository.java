package com.tcs.mydemo.repository;

import com.tcs.mydemo.entity.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository <EmployeeDTO,String> {


}
