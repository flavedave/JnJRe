package de.adesso.jamesjarvis.crm.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record CreateCustomerRequest(
        @NotBlank String firstName,
        @NotBlank String lastName,
        @Email String email,
        String phoneNumber,
        LocalDate dateOfBirth,
        String street,
        String zipCode,
        String city
) {
}
