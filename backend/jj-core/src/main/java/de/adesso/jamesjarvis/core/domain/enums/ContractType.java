package de.adesso.jamesjarvis.core.domain.enums;

/**
 * Vertragstypen basierend auf Betreuungsstatus.
 */
public enum ContractType {
    MANUALLY_ENTERED,       // Manuell erfasst (editierbar)
    CORRESPONDENCE_BROKER,  // Korrespondenz-Makler (read-only)
    ACTIVELY_MANAGED         // Aktiv betreut (read-only)
}
