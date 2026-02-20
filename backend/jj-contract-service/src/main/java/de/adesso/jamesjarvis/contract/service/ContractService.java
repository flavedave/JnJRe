package de.adesso.jamesjarvis.contract.service;

import de.adesso.jamesjarvis.contract.dto.ContractDto;
import de.adesso.jamesjarvis.contract.dto.CreateContractRequest;

import java.util.List;
import java.util.UUID;

public interface ContractService {

    ContractDto createContract(CreateContractRequest request);

    ContractDto getContract(UUID id);

    List<ContractDto> getContractsByCustomer(UUID customerId);

    List<ContractDto> getContractsByIntermediary(UUID intermediaryId);
}
