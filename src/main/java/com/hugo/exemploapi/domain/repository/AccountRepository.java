package com.hugo.exemploapi.domain.repository;

import com.hugo.exemploapi.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
