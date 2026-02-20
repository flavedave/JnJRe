package de.adesso.jamesjarvis.crm.controller;

import de.adesso.jamesjarvis.crm.dto.AppointmentDto;
import de.adesso.jamesjarvis.crm.entity.Appointment;
import de.adesso.jamesjarvis.crm.repository.AppointmentRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/appointments")
@RequiredArgsConstructor
@Tag(name = "Appointments", description = "Appointment management endpoints")
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;

    @GetMapping
    @Operation(summary = "List all appointments", description = "Retrieve all appointments")
    public ResponseEntity<List<AppointmentDto>> getAllAppointments() {
        List<AppointmentDto> appointments = appointmentRepository.findAll().stream()
                .map(this::toDto)
                .toList();
        return ResponseEntity.ok(appointments);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get appointment by ID", description = "Retrieve a single appointment by its UUID")
    public ResponseEntity<AppointmentDto> getAppointment(@PathVariable UUID id) {
        return appointmentRepository.findById(id)
                .map(this::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create appointment", description = "Create a new appointment")
    public ResponseEntity<AppointmentDto> createAppointment(@RequestBody Appointment appointment) {
        Appointment saved = appointmentRepository.save(appointment);
        return ResponseEntity.status(HttpStatus.CREATED).body(toDto(saved));
    }

    @PutMapping("/{id}/status")
    @Operation(summary = "Update appointment status", description = "Update the status of an existing appointment")
    public ResponseEntity<AppointmentDto> updateAppointmentStatus(
            @PathVariable UUID id,
            @RequestBody Map<String, String> statusUpdate) {
        return appointmentRepository.findById(id)
                .map(existing -> {
                    existing.setStatus(statusUpdate.get("status"));
                    Appointment updated = appointmentRepository.save(existing);
                    return ResponseEntity.ok(toDto(updated));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    private AppointmentDto toDto(Appointment appointment) {
        return new AppointmentDto(
                appointment.getId(),
                appointment.getCustomerId(),
                appointment.getIntermediaryId(),
                appointment.getTitle(),
                appointment.getStartTime(),
                appointment.getEndTime(),
                appointment.getStatus()
        );
    }
}
