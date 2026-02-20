package de.adesso.jamesjarvis.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
        "de.adesso.jamesjarvis.crm.entity",
        "de.adesso.jamesjarvis.core.domain.model"
})
@EnableJpaRepositories(basePackages = "de.adesso.jamesjarvis.crm.repository")
public class CrmServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmServiceApplication.class, args);
    }
}
