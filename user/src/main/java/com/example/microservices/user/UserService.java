package com.example.microservices.user;

import java.util.Collection;

public interface UserService {

    User findById(Long id);

    Collection<User> findAll();

}
