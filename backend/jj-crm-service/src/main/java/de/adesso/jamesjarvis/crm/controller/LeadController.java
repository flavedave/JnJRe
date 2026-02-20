package de.adesso.jamesjarvis.crm.controller;

import de.adesso.jamesjarvis.core.domain.model.Lead;
import de.adesso.jamesjarvis.crm.dto.LeadDto;
import de.adesso.jamesjarvis.crm.repository.LeadRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/leads")
@RequiredArgsConstructor
@Tag(name = "Leads", description = "Lead management endpoints")
public class LeadController {

    private final LeadRepository leadRepository;

    @GetMapping
    @Operation(summary = "List all leads", description = "Retrieve all leads")
    public ResponseEntity<List<LeadDto>> getAllLeads() {
        List<LeadDto> leads = leadRepository.findAll().stream()
                .map(this::toDto)
                .toList();
        return ResponseEntity.ok(leads);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get lead by ID", description = "Retrieve a single lead by its UUID")
    public ResponseEntity<LeadDto> getLead(@PathVariable UUID id) {
        return leadRepository.findById(id)
                .map(this::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create lead", description = "Create a new lead record")
    public ResponseEntity<LeadDto> createLead(@RequestBody Lead lead) {
        Lead saved = leadRepository.save(lead);
        return ResponseEntity.status(HttpStatus.CREATED).body(toDto(saved));
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update lead", description = "Update an existing lead by its UUID")
    public ResponseEntity<LeadDto> updateLead(@PathVariable UUID id, @RequestBody Lead leadDetails) {
        return leadRepository.findById(id)
                .map(existing -> {
                    existing.setFirstName(leadDetails.getFirstName());
                    existing.setLastName(leadDetails.getLastName());
                    existing.setEmail(leadDetails.getEmail());
                    existing.setPhoneNumber(leadDetails.getPhoneNumber());
                    existing.setSource(leadDetails.getSource());
                    existing.setStatus(leadDetails.getStatus());
                    existing.setPriority(leadDetails.getPriority());
                    existing.setNotes(leadDetails.getNotes());
                    existing.setNextContactAt(leadDetails.getNextContactAt());
                    existing.setAssignedIntermediaryId(leadDetails.getAssignedIntermediaryId());
                    Lead updated = leadRepository.save(existing);
                    return ResponseEntity.ok(toDto(updated));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    private LeadDto toDto(Lead lead) {
        return new LeadDto(
                lead.getId(),
                lead.getFirstName(),
                lead.getLastName(),
                lead.getEmail(),
                lead.getSource(),
                lead.getStatus(),
                lead.getPriority(),
                lead.getNextContactAt()
        );
    }
}
