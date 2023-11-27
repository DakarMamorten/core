package com.vlad.education;

import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString
public final class Address {
    private final String street;
    private final String house;
    private final String flat;

    public Address(String street, String house, String flat) {
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(house, address.house) && Objects.equals(flat, address.flat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, house, flat);
    }
}
