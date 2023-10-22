package com.hugo.exemploapi.domain.repository;

import com.hugo.exemploapi.domain.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
