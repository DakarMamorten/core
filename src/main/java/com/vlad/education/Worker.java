package com.vlad.education;

import java.time.LocalDate;
import java.util.Objects;

public class Worker extends People {
    private boolean isManager;
    static {
        System.out.println("Initialize block static from child");
    }

    public Worker(String name, LocalDate birthDate, boolean isManager) {
        super(name, birthDate);
        this.isManager = isManager;
        System.out.println("Initialize constructor from child");
    }

    public boolean isManager() {
        return isManager;
    }

    @Override
    protected int calculateSalary() {
        if (isManager){
            return 1000;
        }
        return 800;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return isManager == worker.isManager;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isManager);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "isManager=" + isManager +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
