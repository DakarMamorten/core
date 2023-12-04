package com.vlad.education.functionProgramming;

import lombok.SneakyThrows;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Double> sDouble = () -> myMethod(4D);

        Optional<Double> optionalValue = Optional.empty() ;
//        double result = optionalValue.orElse(myMethod(4D));
        double result2 = optionalValue.orElseGet(() -> myMethod(4D));

//        System.out.println("Result: " + result);
        System.out.println("Result2: " + result2);

//        Consumer<String> stringConsumer = s -> System.out.println(s);
//        Supplier<String> stringSupplier = () -> "Hello";
//        Predicate<String> stringPredicate = s -> s.isEmpty();
//        Function<String, Integer> stringIntegerFunction = Integer::parseInt;
//
//        Function<String, Void> stringVoidFunction = s -> {
//            return null;
//        };
//        Function<Void, String> stringFunction = (x) -> "Hello";
//        Function<String, Boolean> booleanFunction = s -> s.isEmpty();
//
//        MyFunction<String, Integer> parseIntFunction = Integer::parseInt;
//        MyFunction<String, Integer> squareStringInt = parseIntFunction.andThen(x -> x * x);
//
//        var result = squareStringInt.apply("5");
//        System.out.println(result);
//
//        Function<String,String> stringStringFunction = String::toUpperCase;
//        UnaryOperator<String> stringUnaryOperator = String::toUpperCase;
    }

    @SneakyThrows
    private static Double myMethod(Double value) {
        Thread.sleep(5000);
        System.out.println("Call myMethod");
        return value;

    }

    private static void myMethodOptional(Optional<Double> value) {
        System.out.println(value.orElseGet(() -> 10d / 0));
        value.ifPresent(System.out::println);
        value.ifPresentOrElse(System.out::println,() -> System.out.println("Cant perform divide!"));
    }

    interface MyFunction<T, R> {
        R apply(T element);

        default <U> MyFunction<T, U> andThen(MyFunction<R, U> afterFunction) {
            return x -> afterFunction.apply(apply(x));
        }
    }
}
