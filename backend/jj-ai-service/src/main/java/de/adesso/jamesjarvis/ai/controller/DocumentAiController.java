package de.adesso.jamesjarvis.ai.controller;

import de.adesso.jamesjarvis.ai.dto.DocumentAnalysisRequest;
import de.adesso.jamesjarvis.ai.dto.DocumentAnalysisResponse;
import de.adesso.jamesjarvis.ai.service.DocumentAiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ai/documents")
@RequiredArgsConstructor
@Tag(name = "Document AI", description = "AI-powered document analysis and data extraction")
public class DocumentAiController {

    private final DocumentAiService documentAiService;

    @PostMapping("/analyze")
    @Operation(summary = "Analyze a document using AI and extract structured data")
    public ResponseEntity<DocumentAnalysisResponse> analyzeDocument(
            @Valid @RequestBody DocumentAnalysisRequest request) {
        DocumentAnalysisResponse response = documentAiService.analyzeDocument(request);
        return ResponseEntity.ok(response);
    }
}
