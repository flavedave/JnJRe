package de.adesso.jamesjarvis.crm.service;

import de.adesso.jamesjarvis.crm.dto.CreateCustomerRequest;
import de.adesso.jamesjarvis.crm.dto.CustomerDto;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    CustomerDto createCustomer(CreateCustomerRequest request);

    CustomerDto getCustomer(UUID id);

    List<CustomerDto> searchCustomers(String query);

    void deleteCustomer(UUID id);
}
