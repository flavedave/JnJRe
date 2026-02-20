package de.adesso.jamesjarvis.core.domain.event;

import de.adesso.jamesjarvis.core.domain.enums.ContractCategory;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContractCreatedEvent extends DomainEvent {
    private UUID contractId;
    private UUID customerId;
    private UUID intermediaryId;
    private ContractCategory category;

    @Override
    public String getEventType() {
        return "contract.created";
    }
}
