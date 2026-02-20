package de.adesso.jamesjarvis.ai.dto;

import java.util.UUID;

public record ChatRequest(
        String message,
        UUID customerId,
        String sessionId,
        String context
) {
}
