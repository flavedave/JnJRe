package de.adesso.jamesjarvis.core.domain.enums;

/**
 * Hierarchische Rollen im James & Jarvis System.
 * Jede Ebene sieht alles darunter (hierarchische Vererbung).
 */
public enum UserRole {
    CUSTOMER,
    SINGLE_BROKER,
    SUB_INTERMEDIARY,
    TEAM_LEADER,
    SALES_MANAGER,
    POOL_ADMIN,
    SYSTEM_ADMIN
}
