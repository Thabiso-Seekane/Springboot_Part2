package com.example.SprintbootPart2.entities;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String surname;

    public User(UUID id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public User(int i, String thabiso, String seekane) {
    }

    public UUID getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }

    @Override
    public String toString(){
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + '}';
    }
}
