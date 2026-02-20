#!/bin/bash
# Creates Kafka topics for James & Jarvis platform
# Run after Kafka is started: docker exec jj-kafka bash /scripts/create-topics.sh

KAFKA_BIN="/usr/bin"
BOOTSTRAP="localhost:9092"

topics=(
  "jj.customer.events"
  "jj.contract.events"
  "jj.lead.events"
  "jj.appointment.events"
  "jj.messaging.events"
  "jj.ai.tasks"
  "jj.document.events"
  "jj.audit.log"
)

for topic in "${topics[@]}"; do
  kafka-topics --create \
    --bootstrap-server "$BOOTSTRAP" \
    --replication-factor 1 \
    --partitions 3 \
    --topic "$topic" \
    --if-not-exists
  echo "Topic '$topic' created."
done

echo "All topics created successfully."
