package com.drewdomi.employeemanager.employee.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public record CreateEmployeeDto(
        @NotBlank(message = "Name is mandatory")
        @Size(min = 3, max = 255)
        String name,

        @NotBlank(message = "Mother name is mandatory")
        @Size(min = 3, max = 255)
        String motherName,

        @NotBlank(message = "RG is mandatory")
        @Size(min = 9, max = 9)
        String rg,

        @CPF
        @NotBlank(message = "CPF is mandatory")
        @Size(min = 11, max = 11)
        String cpf,

        @NotBlank(message = "BirthDate is mandatory")
        @Size(min = 10, max = 10)
        String birthDate,

        @NotBlank(message = "Plan is mandatory")
        @Size(min = 4, max = 10)
        String plan,

        @NotBlank(message = "AdmissionDate is mandatory")
        @Size(min = 10, max = 10)
        String admissionDate,

        @NotBlank(message = "ValidityDate is mandatory")
        @Size(min = 10, max = 10)
        String validityDate,

        @NotBlank(message = "Registration is mandatory")
        @Size(min = 7, max = 10)
        String registration
) {
}
