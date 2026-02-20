package de.adesso.jamesjarvis.contract.repository;

import de.adesso.jamesjarvis.core.domain.enums.ContractCategory;
import de.adesso.jamesjarvis.core.domain.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ContractRepository extends JpaRepository<Contract, UUID> {

    List<Contract> findByCustomerId(UUID customerId);

    List<Contract> findByIntermediaryId(UUID intermediaryId);

    List<Contract> findByCategoryAndTenantId(ContractCategory category, String tenantId);
}
