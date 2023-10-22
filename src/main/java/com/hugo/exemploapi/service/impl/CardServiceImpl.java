package com.hugo.exemploapi.service.impl;

import com.hugo.exemploapi.domain.model.Card;
import com.hugo.exemploapi.domain.repository.CardRepository;
import com.hugo.exemploapi.service.CardService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository){
        this.cardRepository = cardRepository;
    }

    @Override
    public Card findById(Long id) {
        return cardRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<Card> findAll() {
        return cardRepository.findAll();
    }

}
