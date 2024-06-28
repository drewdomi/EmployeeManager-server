package com.drewdomi.employeemanager.employee.dto;

public record EmployeeDto(
        String name,

        String motherName,

        String rg,

        String cpf,

        String birthDate,

        String plan,

        String admissionDate,

        String validityDate,

        String registration
) {
}
