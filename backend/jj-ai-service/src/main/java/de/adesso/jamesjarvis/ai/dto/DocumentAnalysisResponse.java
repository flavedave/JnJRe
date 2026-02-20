package de.adesso.jamesjarvis.ai.dto;

import java.util.List;
import java.util.Map;

public record DocumentAnalysisResponse(
        String documentType,
        Map<String, String> extractedData,
        double confidence,
        List<String> warnings
) {
}
