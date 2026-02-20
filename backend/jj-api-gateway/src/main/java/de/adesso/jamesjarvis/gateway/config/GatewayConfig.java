package de.adesso.jamesjarvis.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("auth-service", r -> r
                        .path("/api/v1/auth/**")
                        .uri("lb://jj-auth-service"))
                .route("crm-customers", r -> r
                        .path("/api/v1/customers/**")
                        .uri("lb://jj-crm-service"))
                .route("crm-leads", r -> r
                        .path("/api/v1/leads/**")
                        .uri("lb://jj-crm-service"))
                .route("crm-appointments", r -> r
                        .path("/api/v1/appointments/**")
                        .uri("lb://jj-crm-service"))
                .route("contract-service", r -> r
                        .path("/api/v1/contracts/**")
                        .uri("lb://jj-contract-service"))
                .route("ai-service", r -> r
                        .path("/api/v1/ai/**")
                        .uri("lb://jj-ai-service"))
                .build();
    }
}
