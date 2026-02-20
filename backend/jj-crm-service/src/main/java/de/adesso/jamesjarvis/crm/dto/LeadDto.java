package de.adesso.jamesjarvis.crm.dto;

import de.adesso.jamesjarvis.core.domain.enums.LeadSource;

import java.time.Instant;
import java.util.UUID;

public record LeadDto(
        UUID id,
        String firstName,
        String lastName,
        String email,
        LeadSource source,
        String status,
        Integer priority,
        Instant nextContactAt
) {
}
