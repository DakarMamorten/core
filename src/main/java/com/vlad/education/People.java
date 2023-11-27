package com.vlad.education;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

@Getter
public abstract class People {
    public static final float PI = 3.1415926f;
    protected String name;
    protected LocalDate birthDate;

    static {
        System.out.println("Initialize block static from parent");
    }

    protected People(String name, LocalDate birthDate) {
        System.out.println("Initialize constructor from parent");
        this.name = name;
        this.birthDate = birthDate;
    }

    protected int calculateAgeYears() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    protected abstract int calculateSalary();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) && Objects.equals(birthDate, people.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
