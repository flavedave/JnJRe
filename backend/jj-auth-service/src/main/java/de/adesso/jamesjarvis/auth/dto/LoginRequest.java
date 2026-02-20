package de.adesso.jamesjarvis.auth.dto;

public record LoginRequest(
        String email,
        String password
) {
}
