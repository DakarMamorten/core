package com.vlad.wsh.lotto;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class LottoCollections {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 49;
    private static final int COUNT_NUMBERS = 6;
    private static final Random RANDOM = new Random();

    public void start() {
        Set<Integer> numbersFromUser = getNumbersFromUser();
        Set<Integer> randomNumbers = getRandomNumbers();
        long days = 1;
        while (!numbersFromUser.containsAll(randomNumbers)) {
            days++;
            randomNumbers = getRandomNumbers();
        }
        System.out.println(convertDaysToYears(days));

    }

    private Set<Integer> getNumbersFromUser() {
        Set<Integer> numbers = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
       System.out.print("Input six numbers divided by space: ");
        for (int i = 0; i < COUNT_NUMBERS; i++) {
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }

    private Set<Integer> getRandomNumbers() {
        Set<Integer> numbers = new TreeSet<>();
        while (numbers.size() < COUNT_NUMBERS) {
            numbers.add(getRandomNumber());
        }
        return numbers;
    }

    private int getRandomNumber() {
        return RANDOM.nextInt(MAX_VALUE) + MIN_VALUE;
    }

    public String convertDaysToYears(long days) {
        int years = (int) (days / 365);
        int restDays = (int) (days % 365);
        return String.format("Count of years: %d, days: %d", years, restDays);
    }

}
