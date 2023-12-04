package com.javarush;

import java.util.List;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<User> users = List.of(new User("Vasya", 25), new User("Ihor", 15), new User("Ivan", 20));
        users.stream()
                .filter(u-> u.getAge() >20);

    }
}
