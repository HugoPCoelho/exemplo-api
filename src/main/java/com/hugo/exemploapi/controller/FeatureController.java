package com.hugo.exemploapi.controller;

import com.hugo.exemploapi.domain.model.Feature;
import com.hugo.exemploapi.service.FeatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/features")
public class FeatureController {

    private final FeatureService featureService;

    public FeatureController(FeatureService featureService){
        this.featureService = featureService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Feature> findById(@PathVariable Long id){
        var feature = featureService.findById(id);
        return ResponseEntity.ok(feature);
    }

    @GetMapping
    public List<Feature> findAll(){
        return featureService.findAll();
    }

}
