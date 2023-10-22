package com.hugo.exemploapi.service.impl;

import com.hugo.exemploapi.domain.model.Feature;
import com.hugo.exemploapi.domain.repository.FeatureRepository;
import com.hugo.exemploapi.service.FeatureService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class FeatureServiceImpl implements FeatureService {

    private final FeatureRepository featureRepository;

    public FeatureServiceImpl(FeatureRepository featureRepository){
        this.featureRepository = featureRepository;
    }

    @Override
    public Feature findById(Long id) {
        return featureRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Feature> findAll() {
        return featureRepository.findAll();
    }
}
