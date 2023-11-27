package com.vlad.bobocode.functionProgramming;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        Supplier<String> stringSupplier = () -> "Hello";
        Predicate<String> stringPredicate = s -> s.isEmpty();
        Function<String, Integer> stringIntegerFunction = s -> Integer.parseInt(s);
        Function<String,Void> stringVoidFunction = s -> {
            return null ;
        };
        Function<Void,String> stringFunction = (x) -> "Hello";
        Function<String,Boolean> booleanFunction = s -> s.isEmpty();

        MyFunction<String, Integer> parseIntFunction = s -> Integer.parseInt(s);



    }

    interface MyFunction<T,R> {
        R apply(T element);
    }
}
