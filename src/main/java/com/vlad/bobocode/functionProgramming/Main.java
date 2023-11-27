package com.vlad.bobocode.functionProgramming;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        Supplier<String> stringSupplier = () -> "Hello";
        Predicate<String> stringPredicate = s -> s.isEmpty();
        Function<String, Integer> stringIntegerFunction = Integer::parseInt;

        Function<String, Void> stringVoidFunction = s -> {
            return null;
        };
        Function<Void, String> stringFunction = (x) -> "Hello";
        Function<String, Boolean> booleanFunction = s -> s.isEmpty();

        MyFunction<String, Integer> parseIntFunction = Integer::parseInt;
        MyFunction<String, Integer> squareStringInt = parseIntFunction.andThen(x -> x * x);

        var result = squareStringInt.apply("5");
        System.out.println(result);

        Function<String,String> stringStringFunction = String::toUpperCase;
        UnaryOperator<String> stringUnaryOperator = String::toUpperCase;
    }

    interface MyFunction<T, R> {
        R apply(T element);

        default <U> MyFunction<T, U> andThen(MyFunction<R, U> afterFunction) {
            return x -> afterFunction.apply(apply(x));
        }
    }
}
