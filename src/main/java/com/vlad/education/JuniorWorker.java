package com.vlad.education;

import java.time.LocalDate;

public class JuniorWorker extends People {
    public JuniorWorker(String name, LocalDate birthDate) {
        super(name, birthDate);
    }


    @Override
    protected int calculateSalary() {
     return 2000;//complicated calculation for age < 26
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "JuniorWorker{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
