package de.adesso.jamesjarvis.contract.mapper;

import de.adesso.jamesjarvis.contract.dto.ContractDto;
import de.adesso.jamesjarvis.contract.dto.CreateContractRequest;
import de.adesso.jamesjarvis.core.domain.model.Contract;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContractMapper {

    ContractDto toDto(Contract contract);

    List<ContractDto> toDtoList(List<Contract> contracts);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "tenantId", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "cancellationDate", ignore = true)
    @Mapping(target = "deductible", ignore = true)
    @Mapping(target = "notes", ignore = true)
    @Mapping(target = "active", constant = "true")
    Contract toEntity(CreateContractRequest request);
}
