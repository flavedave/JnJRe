package de.adesso.jamesjarvis.crm.repository;

import de.adesso.jamesjarvis.core.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {

    List<Customer> findByTenantId(String tenantId);

    Optional<Customer> findByEmail(String email);

    List<Customer> findByLastNameContainingIgnoreCase(String lastName);
}
