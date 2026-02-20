package de.adesso.jamesjarvis.core.domain.model;

import de.adesso.jamesjarvis.core.domain.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "intermediaries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Intermediary extends BaseEntity {

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

    @Column(name = "ihk_registration_number")
    private String ihkRegistrationNumber;

    @Column(name = "legal_form")
    private String legalForm;

    @Column(name = "company_name")
    private String companyName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    @Column(name = "parent_intermediary_id")
    private UUID parentIntermediaryId;

    @Column(name = "pool_id")
    private UUID poolId;

    @Column(name = "active")
    private Boolean active;
}
