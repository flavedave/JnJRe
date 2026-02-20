package de.adesso.jamesjarvis.contract.entity;

import de.adesso.jamesjarvis.core.domain.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "commissions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Commission extends BaseEntity {

    @Column(name = "contract_id", nullable = false)
    private UUID contractId;

    @Column(name = "intermediary_id", nullable = false)
    private UUID intermediaryId;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "commission_type", nullable = false)
    private String commissionType;

    @Column(name = "period_start")
    private LocalDate periodStart;

    @Column(name = "period_end")
    private LocalDate periodEnd;

    @Column(name = "paid")
    private boolean paid;
}
