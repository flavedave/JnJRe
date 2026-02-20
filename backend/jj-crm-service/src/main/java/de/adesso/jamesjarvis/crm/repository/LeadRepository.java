package de.adesso.jamesjarvis.crm.repository;

import de.adesso.jamesjarvis.core.domain.model.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Repository
public interface LeadRepository extends JpaRepository<Lead, UUID> {

    List<Lead> findByAssignedIntermediaryId(UUID intermediaryId);

    List<Lead> findByStatusAndTenantId(String status, String tenantId);

    List<Lead> findByNextContactAtBefore(Instant cutoff);
}
