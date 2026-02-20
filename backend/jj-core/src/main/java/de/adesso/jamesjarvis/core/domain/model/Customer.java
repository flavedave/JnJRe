package de.adesso.jamesjarvis.core.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer extends BaseEntity {

    @NotBlank
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Email
    @Column(unique = true)
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "street")
    private String street;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "city")
    private String city;

    @Column(name = "social_security_number")
    private String socialSecurityNumber;

    @Column(name = "tax_id")
    private String taxId;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "annual_income")
    private Long annualIncome;

    @Column(name = "data_visibility_consent")
    private Boolean dataVisibilityConsent;

    @Column(name = "profile_notes", columnDefinition = "TEXT")
    private String profileNotes;
}
