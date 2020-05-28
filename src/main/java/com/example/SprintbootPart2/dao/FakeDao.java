package com.example.SprintbootPart2.dao;

import com.example.SprintbootPart2.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("FakeDao")
public abstract class FakeDao implements FakeDaoInterface {

    private static List<User> DB = new ArrayList();

    @Override
    public int insert(UUID id, User user) {
        // than we add to our database list.
        DB.add(new User(id,user.getName(), user.getSurname()));
        return 1;
    }

    @Override
    public List<User> selectAllUsers() {
        return DB;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return DB.stream() // a way to search the database.
                .filter(user -> user.getId()
                        .equals(id))
                .findFirst();
    }

    @Override
    public int deleteUserById(UUID id) {
        Optional<User> personMaybe = selectUserById(id);
        if (personMaybe.isEmpty()){
            return 0;
        }
        DB.remove(personMaybe.get());
        return 1;
    }
}
