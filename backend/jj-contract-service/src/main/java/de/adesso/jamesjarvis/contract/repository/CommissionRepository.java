package de.adesso.jamesjarvis.contract.repository;

import de.adesso.jamesjarvis.contract.entity.Commission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface CommissionRepository extends JpaRepository<Commission, UUID> {

    List<Commission> findByIntermediaryIdAndPeriodStartBetween(UUID intermediaryId, LocalDate from, LocalDate to);

    List<Commission> findByContractId(UUID contractId);
}
