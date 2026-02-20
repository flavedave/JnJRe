# James & Jarvis

KI-gestütztes CRM-Plus für Versicherungsvermittler - Modulare SaaS-Plattform.

## Architektur

| Komponente | Technologie | Port |
|---|---|---|
| API Gateway | Spring Cloud Gateway | 8080 |
| Auth Service | Spring Boot + OAuth2/JWT | 8081 |
| CRM Service | Spring Boot + JPA | 8082 |
| Contract Service | Spring Boot + JPA | 8083 |
| AI Service | Spring Boot + Spring AI | 8084 |
| Frontend | Angular 18 | 4200 |
| PostgreSQL | 16-alpine | 5432-5434 |
| Kafka | Confluent 7.7 | 9092 |
| MinIO (S3) | Latest | 9000 |

## Schnellstart

```bash
# 1. Infrastruktur starten
docker compose -f infrastructure/docker/docker-compose.yml up -d

# 2. Backend bauen
cd backend && mvn clean install

# 3. Services starten (jeweils in eigenem Terminal)
cd backend/jj-auth-service && mvn spring-boot:run
cd backend/jj-crm-service && mvn spring-boot:run
cd backend/jj-contract-service && mvn spring-boot:run
cd backend/jj-ai-service && mvn spring-boot:run
cd backend/jj-api-gateway && mvn spring-boot:run

# 4. Frontend starten
cd frontend && npm install && ng serve
```

## Portale

- **JARVIS** (Vermittlerportal): `http://localhost:4200/jarvis`
- **JAMES** (Kundenportal): `http://localhost:4200/james`

## Projektstruktur

```
backend/
  jj-core/              Shared Domain-Modelle, Events, Enums
  jj-auth-service/      OAuth2/JWT Authentication
  jj-crm-service/       CRM: Kunden, Leads, Termine, Kommunikation
  jj-contract-service/  Verträge, Provisionen, Stornohaftung
  jj-ai-service/        KI: Chatbot, Document-AI, Copilot
  jj-api-gateway/       API Gateway (Routing, Security)
frontend/               Angular SPA (James + Jarvis)
infrastructure/         Docker, Kubernetes, Kafka
```
