package com.hugo.exemploapi.domain.repository;

import com.hugo.exemploapi.domain.model.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature, Long> {
}
