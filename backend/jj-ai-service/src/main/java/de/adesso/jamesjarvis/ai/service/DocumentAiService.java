package de.adesso.jamesjarvis.ai.service;

import de.adesso.jamesjarvis.ai.dto.DocumentAnalysisRequest;
import de.adesso.jamesjarvis.ai.dto.DocumentAnalysisResponse;

public interface DocumentAiService {

    DocumentAnalysisResponse analyzeDocument(DocumentAnalysisRequest request);
}
