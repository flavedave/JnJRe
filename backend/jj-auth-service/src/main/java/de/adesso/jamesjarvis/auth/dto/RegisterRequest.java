package de.adesso.jamesjarvis.auth.dto;

import de.adesso.jamesjarvis.core.domain.enums.UserRole;

public record RegisterRequest(
        String email,
        String password,
        String firstName,
        String lastName,
        String tenantId,
        UserRole role
) {
}
