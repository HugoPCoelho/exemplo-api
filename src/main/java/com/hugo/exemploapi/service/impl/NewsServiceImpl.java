package com.hugo.exemploapi.service.impl;

import com.hugo.exemploapi.domain.model.News;
import com.hugo.exemploapi.domain.repository.NewsRepository;
import com.hugo.exemploapi.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository){
        this.newsRepository = newsRepository;
    }

    @Override
    public News findById(Long id) {
        return newsRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<News> findAll() {
        return newsRepository.findAll();
    }
}
