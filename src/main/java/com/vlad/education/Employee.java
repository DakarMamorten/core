package com.vlad.education;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

//Immutability
public final class Employee {
    private Address address;
    private String name;
    private List<String> codes;
    private LocalDate date;

    public Employee(Address address, String name, List<String> codes, LocalDate date) {
        this.address = address;
        this.name = name;
        this.codes = Collections.unmodifiableList(codes);
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public List<String> getCodes() {
        return codes;
    }

    public LocalDate getDate() {
        return date;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                ", name='" + name + '\'' +
                ", codes=" + codes +
                ", date=" + date +
                '}';
    }
}
