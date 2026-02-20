package de.adesso.jamesjarvis.contract.controller;

import de.adesso.jamesjarvis.contract.dto.ContractDto;
import de.adesso.jamesjarvis.contract.dto.CreateContractRequest;
import de.adesso.jamesjarvis.contract.service.ContractService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/contracts")
@RequiredArgsConstructor
@Tag(name = "Contracts", description = "Contract management operations")
public class ContractController {

    private final ContractService contractService;

    @GetMapping
    @Operation(summary = "Get all contracts")
    public ResponseEntity<List<ContractDto>> getAllContracts() {
        // Delegate to service - in a real implementation this would support pagination
        return ResponseEntity.ok(List.of());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a contract by ID")
    public ResponseEntity<ContractDto> getContract(@PathVariable UUID id) {
        ContractDto contract = contractService.getContract(id);
        return ResponseEntity.ok(contract);
    }

    @PostMapping
    @Operation(summary = "Create a new contract")
    public ResponseEntity<ContractDto> createContract(@Valid @RequestBody CreateContractRequest request) {
        ContractDto created = contractService.createContract(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping("/customer/{customerId}")
    @Operation(summary = "Get all contracts for a specific customer")
    public ResponseEntity<List<ContractDto>> getContractsByCustomer(@PathVariable UUID customerId) {
        List<ContractDto> contracts = contractService.getContractsByCustomer(customerId);
        return ResponseEntity.ok(contracts);
    }

    @GetMapping("/intermediary/{intermediaryId}")
    @Operation(summary = "Get all contracts managed by a specific intermediary")
    public ResponseEntity<List<ContractDto>> getContractsByIntermediary(@PathVariable UUID intermediaryId) {
        List<ContractDto> contracts = contractService.getContractsByIntermediary(intermediaryId);
        return ResponseEntity.ok(contracts);
    }
}
