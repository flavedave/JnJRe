package de.adesso.jamesjarvis.contract.dto;

import de.adesso.jamesjarvis.core.domain.enums.ContractCategory;
import de.adesso.jamesjarvis.core.domain.enums.ContractType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record ContractDto(
        UUID id,
        UUID customerId,
        String insurerName,
        String policyNumber,
        ContractCategory category,
        ContractType type,
        String productName,
        BigDecimal premium,
        LocalDate startDate,
        LocalDate endDate,
        boolean active
) {
}
