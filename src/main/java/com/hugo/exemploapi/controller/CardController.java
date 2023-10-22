package com.hugo.exemploapi.controller;

import com.hugo.exemploapi.domain.model.Card;
import com.hugo.exemploapi.service.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {

    private final CardService cardService;

    public  CardController(CardService cardService){
        this.cardService = cardService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Card> findById(@PathVariable Long id){
        var card = cardService.findById(id);
        return ResponseEntity.ok(card);
    }

    @GetMapping
    public List<Card> findAll(){
        return cardService.findAll();
    }
}
