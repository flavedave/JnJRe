package de.adesso.jamesjarvis.auth.repository;

import de.adesso.jamesjarvis.auth.entity.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, UUID> {

    Optional<UserAccount> findByEmail(String email);

    List<UserAccount> findByTenantId(String tenantId);

    boolean existsByEmail(String email);
}
