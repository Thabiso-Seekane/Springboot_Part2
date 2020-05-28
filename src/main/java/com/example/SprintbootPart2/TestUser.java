package com.example.SprintbootPart2;

import com.example.SprintbootPart2.entities.User;

public class TestUser {
    public static void main(String[] args) {
        User user = new User(1,"Thabiso","Seekane");
        String print = user.toString();
        System.out.println(print);
    }
}
