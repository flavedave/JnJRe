package de.adesso.jamesjarvis.crm.dto;

import java.time.Instant;
import java.util.UUID;

public record AppointmentDto(
        UUID id,
        UUID customerId,
        UUID intermediaryId,
        String title,
        Instant startTime,
        Instant endTime,
        String status
) {
}
