package de.adesso.jamesjarvis.crm.repository;

import de.adesso.jamesjarvis.crm.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, UUID> {

    List<Appointment> findByCustomerIdAndStartTimeAfter(UUID customerId, Instant startTime);

    List<Appointment> findByIntermediaryIdAndStartTimeBetween(UUID intermediaryId, Instant start, Instant end);
}
