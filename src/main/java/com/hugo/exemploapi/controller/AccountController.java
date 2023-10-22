package com.hugo.exemploapi.controller;

import com.hugo.exemploapi.domain.model.Account;
import com.hugo.exemploapi.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> findById(@PathVariable Long id){
        var account = accountService.findById(id);
        return ResponseEntity.ok(account);
    }

    @GetMapping
    public List<Account> findAll(){
        return accountService.findAll();
    }

}
