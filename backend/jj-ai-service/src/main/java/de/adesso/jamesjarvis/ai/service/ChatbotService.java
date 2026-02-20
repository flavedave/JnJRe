package de.adesso.jamesjarvis.ai.service;

import de.adesso.jamesjarvis.ai.dto.ChatRequest;
import de.adesso.jamesjarvis.ai.dto.ChatResponse;

public interface ChatbotService {

    ChatResponse processMessage(ChatRequest request);
}
