# James & Jarvis - Projekt-Richtlinien

## Projektübersicht
KI-gestütztes CRM-Plus (SaaS) für Versicherungsvermittler.
- **JARVIS** = Vermittlerportal (Akquise, CRM, Beratung, Dashboard, Verträge, Provisionen)
- **JAMES** = Kundenportal (Chatbot, Termine, Verträge, Document-AI, Schäden)
- Zwei Portale, ein gemeinsames Angular-Frontend mit rollenbasierten Ansichten.

## Tech-Stack
- **Backend**: Java 21, Spring Boot 3.3, Spring AI, Spring Security (OAuth2/JWT)
- **Frontend**: Angular 18, TypeScript, Angular Material, SCSS
- **Datenbank**: PostgreSQL (pro Tenant), Flyway-Migrationen
- **Messaging**: Apache Kafka (Event Streaming)
- **Infrastruktur**: Docker, Kubernetes, S3-kompatibel
- **Build**: Maven (Backend), npm/Angular CLI (Frontend)

## Monorepo-Struktur
```
backend/               → Java Maven Multi-Module
  jj-core/             → Shared Domain-Modelle, DTOs, Events, Enums
  jj-auth-service/     → OAuth2 Authorization Server + User Management
  jj-crm-service/      → CRM-Kern: Kunden, Akquise, Kalender, Messaging
  jj-contract-service/ → Vertragsmanagement, Provisionen
  jj-ai-service/       → KI: Chatbot-Engine, Document-AI, Copilot
  jj-api-gateway/      → Spring Cloud Gateway (Routing, Rate Limiting)
frontend/              → Angular SPA
infrastructure/        → Docker, K8s, Kafka Configs
```

## Architektur-Prinzipien
- **Modularität**: Jedes Feature als eigenständiges Modul mit Feature-Flags
- **Multi-Tenancy**: Mandantenfähigkeit auf Datenbankebene (Schema-per-Tenant)
- **LLM-Agnostik**: Abstraktionsschicht - KI-Anbieter austauschbar
- **Event-Driven**: Kafka für lose Kopplung zwischen Services
- **Security by Design**: DSGVO, Verschlüsselung, MFA, Audit-Logging
- **Connector/Adapter Pattern**: Integrationsarchitektur (GDV/BiPRO, Vergleichsrechner)
- **i18n-Ready**: Sprachdateien statt hart verdrahteter Texte

## Rollen & Rechte
Hierarchische Vererbung: Kunde → Einzelmakler → Untervermittler → Teamleiter → Vertriebsleiter → Pool-Admin → System-Admin

## Code-Konventionen
- Java: Lombok (@Data, @Builder, @NoArgsConstructor), MapStruct für Mapping
- Entities verwenden `id` (nicht `customerId`), JoinColumn mit `name = "..."` Annotation
- DTOs als Java Records wo möglich
- Controller-Endpunkte: REST, versioniert (/api/v1/...)
- Tests: JUnit 5, Mockito, Testcontainers für Integrationstests
- Angular: Feature-Module mit Lazy Loading, OnPush Change Detection
- Commit Messages auf Englisch, kurz und prägnant

## Befehle
- Backend bauen: `cd backend && mvn clean install`
- Einzelnen Service starten: `cd backend/jj-crm-service && mvn spring-boot:run`
- Frontend starten: `cd frontend && ng serve`
- Docker-Umgebung: `docker compose -f infrastructure/docker/docker-compose.yml up`
