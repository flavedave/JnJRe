package de.adesso.jamesjarvis.core.domain.event;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerCreatedEvent extends DomainEvent {
    private UUID customerId;
    private String email;
    private String firstName;
    private String lastName;

    @Override
    public String getEventType() {
        return "customer.created";
    }
}
