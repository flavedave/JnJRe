package de.adesso.jamesjarvis.core.domain.model;

import de.adesso.jamesjarvis.core.domain.enums.ContractCategory;
import de.adesso.jamesjarvis.core.domain.enums.ContractType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "contracts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contract extends BaseEntity {

    @Column(name = "customer_id", nullable = false)
    private UUID customerId;

    @Column(name = "intermediary_id")
    private UUID intermediaryId;

    @Column(name = "insurer_name")
    private String insurerName;

    @Column(name = "policy_number")
    private String policyNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ContractCategory category;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ContractType type;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "premium")
    private BigDecimal premium;

    @Column(name = "payment_frequency")
    private String paymentFrequency;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "cancellation_date")
    private LocalDate cancellationDate;

    @Column(name = "sum_insured")
    private BigDecimal sumInsured;

    @Column(name = "deductible")
    private BigDecimal deductible;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    @Column(name = "active")
    private Boolean active;
}
