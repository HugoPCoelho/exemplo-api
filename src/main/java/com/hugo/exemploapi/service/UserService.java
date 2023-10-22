package com.hugo.exemploapi.service;

import com.hugo.exemploapi.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
