package com.drewdomi.employeemanager.account.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateAccount(

        @NotBlank(message = "Code is mandatory")
        @Size(min = 8, max = 20)
        String code,

        @NotBlank(message = "Password is mandatory")
        @Size(min = 4, max = 255)
        String password
) {
}
