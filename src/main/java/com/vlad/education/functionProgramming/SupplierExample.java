package com.vlad.education.functionProgramming;

import java.util.Optional;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random();

        double randomNumber = randomSupplier.get();
        System.out.println("Случайное число: " + randomNumber);

        Supplier<Double> sDouble = () -> Math.random();

        Optional<Double> optionalValue = Optional.empty();
        System.out.println(optionalValue.orElseGet(sDouble));

    }



}
