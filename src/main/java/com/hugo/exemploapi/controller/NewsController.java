package com.hugo.exemploapi.controller;

import com.hugo.exemploapi.domain.model.News;
import com.hugo.exemploapi.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService){
        this.newsService = newsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<News> findById(@PathVariable Long id){
        var news = newsService.findById(id);
        return ResponseEntity.ok(news);
    }

    @GetMapping
    public List<News> findAll(){
        return newsService.findAll();
    }

}
