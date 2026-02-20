package de.adesso.jamesjarvis.ai.dto;

public record DocumentAnalysisRequest(
        String documentType,
        String base64Content,
        String fileName
) {
}
