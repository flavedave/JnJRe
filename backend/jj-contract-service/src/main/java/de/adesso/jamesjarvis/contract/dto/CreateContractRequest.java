package de.adesso.jamesjarvis.contract.dto;

import de.adesso.jamesjarvis.core.domain.enums.ContractCategory;
import de.adesso.jamesjarvis.core.domain.enums.ContractType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record CreateContractRequest(
        UUID customerId,
        UUID intermediaryId,
        String insurerName,
        String policyNumber,
        ContractCategory category,
        ContractType type,
        String productName,
        BigDecimal premium,
        String paymentFrequency,
        LocalDate startDate,
        LocalDate endDate,
        BigDecimal sumInsured
) {
}
