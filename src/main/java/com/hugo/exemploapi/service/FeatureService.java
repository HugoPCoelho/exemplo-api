package com.hugo.exemploapi.service;

import com.hugo.exemploapi.domain.model.Feature;

import java.util.List;

public interface FeatureService {

    Feature findById(Long id);

    List<Feature> findAll();
}
