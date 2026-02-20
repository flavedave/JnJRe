package de.adesso.jamesjarvis.ai.controller;

import de.adesso.jamesjarvis.ai.dto.ChatRequest;
import de.adesso.jamesjarvis.ai.dto.ChatResponse;
import de.adesso.jamesjarvis.ai.service.ChatbotService;
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
@RequestMapping("/api/v1/ai/chat")
@RequiredArgsConstructor
@Tag(name = "AI Chatbot", description = "AI-powered chatbot for insurance consultation")
public class ChatController {

    private final ChatbotService chatbotService;

    @PostMapping
    @Operation(summary = "Send a message to the AI chatbot")
    public ResponseEntity<ChatResponse> chat(@Valid @RequestBody ChatRequest request) {
        ChatResponse response = chatbotService.processMessage(request);
        return ResponseEntity.ok(response);
    }
}
