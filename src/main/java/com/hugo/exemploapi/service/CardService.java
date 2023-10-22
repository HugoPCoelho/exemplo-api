package com.hugo.exemploapi.service;

import com.hugo.exemploapi.domain.model.Card;

import java.util.List;

public interface CardService {

    Card findById(Long id);

    List<Card> findAll();
}
