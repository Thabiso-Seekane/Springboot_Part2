package com.example.SprintbootPart2.Services;

import com.example.SprintbootPart2.dao.FakeDao;
import com.example.SprintbootPart2.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public abstract class Services implements ServicesInterface {

    private final FakeDao fakeDao;

    @Autowired
    public Services(@Qualifier("FakeDao")FakeDao fakeDao) {
        this.fakeDao = fakeDao;
    }

    @Override
    public long addUser(User user){
        return fakeDao.insert(user);
    }

    @Override
    public Optional<User> getUsersById(UUID id){
        return fakeDao.selectUserById(id);
    }

    @Override
    public int deleteUserById(UUID id){
        return fakeDao.deleteUserById(id);
    }

}
