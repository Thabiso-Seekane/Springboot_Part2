package com.example.SprintbootPart2.dao;

import com.example.SprintbootPart2.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FakeDaoInterface {

    int insert(UUID id, User user);

    default int insert(User user){
        UUID id = UUID.randomUUID();
        return insert(id,user);
    }

    List<User> selectAllUsers();

    Optional<User> selectUserById(UUID id);

    int deleteUserById(UUID id);
}
