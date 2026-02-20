package de.adesso.jamesjarvis.auth.dto;

import de.adesso.jamesjarvis.core.domain.enums.UserRole;

public record LoginResponse(
        String accessToken,
        String refreshToken,
        long expiresIn,
        UserRole userRole
) {
}
