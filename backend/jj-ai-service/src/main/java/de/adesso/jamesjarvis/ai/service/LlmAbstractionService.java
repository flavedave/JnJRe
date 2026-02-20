package de.adesso.jamesjarvis.ai.service;

import java.util.List;
import java.util.Map;

/**
 * LLM abstraction layer - decouples business logic from specific LLM provider.
 * Implementations can target OpenAI, Anthropic, or any other LLM backend.
 */
public interface LlmAbstractionService {

    String chat(String systemPrompt, String userMessage);

    String chat(String systemPrompt, String userMessage, List<Map<String, String>> history);

    String analyzeDocument(String base64Content, String instructions);
}
