package com.app.santander.service;

import com.app.santander.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
