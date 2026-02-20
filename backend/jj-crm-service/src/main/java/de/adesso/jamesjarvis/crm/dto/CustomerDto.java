package de.adesso.jamesjarvis.crm.dto;

import java.util.UUID;

public record CustomerDto(
        UUID id,
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String city
) {
}
