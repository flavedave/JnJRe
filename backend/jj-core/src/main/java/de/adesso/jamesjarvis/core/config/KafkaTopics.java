package de.adesso.jamesjarvis.core.config;

/**
 * Zentrale Definition aller Kafka-Topics.
 */
public final class KafkaTopics {

    private KafkaTopics() {
    }

    public static final String CUSTOMER_EVENTS = "jj.customer.events";
    public static final String CONTRACT_EVENTS = "jj.contract.events";
    public static final String LEAD_EVENTS = "jj.lead.events";
    public static final String APPOINTMENT_EVENTS = "jj.appointment.events";
    public static final String MESSAGING_EVENTS = "jj.messaging.events";
    public static final String AI_TASKS = "jj.ai.tasks";
    public static final String DOCUMENT_EVENTS = "jj.document.events";
    public static final String AUDIT_LOG = "jj.audit.log";
}
