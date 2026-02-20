package de.adesso.jamesjarvis.ai.dto;

import java.util.List;
import java.util.Map;

public record ChatResponse(
        String message,
        String sessionId,
        List<String> suggestedActions,
        Map<String, Object> metadata
) {
}
