package com.example.microservices.user;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DefaultUserService implements UserService {

    private final static Map<Long, User> userRepository;

    static {
        userRepository = Stream.of(
                new User(1L, "Serhii"),
                new User(2L, "Anastasia")
        ).collect(Collectors.toMap(User::getId, user -> user));
    }

    @Override
    public User findById(Long id) {
        return userRepository.get(id);
    }

    @Override
    public Collection<User> findAll() {
        return userRepository.values();
    }


}
