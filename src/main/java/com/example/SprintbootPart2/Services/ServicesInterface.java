package com.example.SprintbootPart2.Services;

import com.example.SprintbootPart2.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface ServicesInterface {
    long addUser(User user);

    Optional<User> getUsersById(UUID id);

    int deleteUserById(UUID id);

    Optional<User> getUsersById(long id);

    int deleteUserById(long id);
}
