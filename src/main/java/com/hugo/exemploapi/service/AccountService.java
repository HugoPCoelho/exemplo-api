package com.hugo.exemploapi.service;

import com.hugo.exemploapi.domain.model.Account;

import java.util.List;

public interface AccountService {

    Account findById(Long id);

    List<Account> findAll();
}
