package com.vlad.education;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

//Immutability
@Getter
@ToString
@EqualsAndHashCode
public final class Employee {
    private final Address address;
    private final String name;
    private final List<String> codes;
    private final LocalDate date;

    private Employee(Address address, String name, List<String> codes, LocalDate date) {
        this.address = address;
        this.name = name;
        this.codes = Collections.unmodifiableList(codes);
        this.date = date;
    }

    public static Employee of(Address address, String name, List<String> codes, LocalDate date){
       return  new Employee(address, name, codes, date);
    }
}
