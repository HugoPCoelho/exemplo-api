package com.hugo.exemploapi.service;

import com.hugo.exemploapi.domain.model.News;

import java.util.List;

public interface NewsService {

    News findById(Long id);

    List<News> findAll();
}
