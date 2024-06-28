package com.drewdomi.employeemanager.employee;

import com.drewdomi.employeemanager.employee.dto.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, UUID> {

    List<EmployeeDto> findAllBy();
}
