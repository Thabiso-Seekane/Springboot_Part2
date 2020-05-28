package com.example.SprintbootPart2.Services;

import com.example.SprintbootPart2.dao.FakeDao;
import com.example.SprintbootPart2.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
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
    @Cacheable("User")
    public Optional<User> getUsersById(UUID id){
        try {
            System.out.println("Going to sleep for 5 Secs... to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        fakeDao.selectUserById(id);
        return null;
    }

    @Override
    public int deleteUserById(UUID id){
        return fakeDao.deleteUserById(id);
    }

}
