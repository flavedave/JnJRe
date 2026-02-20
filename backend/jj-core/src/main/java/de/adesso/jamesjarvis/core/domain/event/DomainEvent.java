package de.adesso.jamesjarvis.core.domain.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class DomainEvent {
    private UUID eventId = UUID.randomUUID();
    private Instant timestamp = Instant.now();
    private String tenantId;
    private String triggeredBy;

    public abstract String getEventType();
}
