package com.hugo.exemploapi.domain.repository;

import com.hugo.exemploapi.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
