package de.adesso.jamesjarvis.core.domain.model;

import de.adesso.jamesjarvis.core.domain.enums.LeadSource;
import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "leads")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Lead extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private LeadSource source;

    @Column(name = "referrer_customer_id")
    private UUID referrerCustomerId;

    @Column(name = "assigned_intermediary_id")
    private UUID assignedIntermediaryId;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "contact_attempts")
    private Integer contactAttempts;

    @Column(name = "last_contact_at")
    private Instant lastContactAt;

    @Column(name = "next_contact_at")
    private Instant nextContactAt;

    @Column(name = "status")
    private String status;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    @Column(name = "converted_to_customer_id")
    private UUID convertedToCustomerId;
}
