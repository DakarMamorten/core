package com.vlad.education.functionProgramming;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num > 0;

        System.out.println("Число 5 положительное? " + isPositive.test(5));
        System.out.println("Число -3 положительное? " + isPositive.test(-3));

    }


}
