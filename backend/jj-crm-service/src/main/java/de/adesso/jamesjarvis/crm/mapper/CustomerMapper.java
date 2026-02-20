package de.adesso.jamesjarvis.crm.mapper;

import de.adesso.jamesjarvis.core.domain.model.Customer;
import de.adesso.jamesjarvis.crm.dto.CreateCustomerRequest;
import de.adesso.jamesjarvis.crm.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto toDto(Customer customer);

    List<CustomerDto> toDtoList(List<Customer> customers);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "tenantId", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    @Mapping(target = "version", ignore = true)
    @Mapping(target = "socialSecurityNumber", ignore = true)
    @Mapping(target = "taxId", ignore = true)
    @Mapping(target = "maritalStatus", ignore = true)
    @Mapping(target = "occupation", ignore = true)
    @Mapping(target = "annualIncome", ignore = true)
    @Mapping(target = "dataVisibilityConsent", ignore = true)
    @Mapping(target = "profileNotes", ignore = true)
    Customer toEntity(CreateCustomerRequest request);
}
