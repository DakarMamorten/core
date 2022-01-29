package com.vlad.epam;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        Math.random();
    }

    public static void bark(){
        System.out.println("Bark");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
