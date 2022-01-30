package com.vlad.wsh.lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class LottoArrays {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 49;
    private static final Random RANDOM = new Random();

    public void start() {
        int[] numbersFromUser = getNumbersFromUser();
        Arrays.sort(numbersFromUser);
        int[] randomNumbers = getRandomNumbers();
        long days = 1;
        while (!Arrays.equals(numbersFromUser, randomNumbers)) {
            days++;
            randomNumbers = getRandomNumbers();
        }
        System.out.println(convertDaysToYears(days));

    }

    private int[] getNumbersFromUser() {
        int[] numbers = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input six numbers divided by space: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private int[] getRandomNumbers() {
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = getRandomNumber();
            if (!isNumberExist(randomNumber, numbers)) {
                numbers[i] = randomNumber;
            }
        }
        Arrays.sort(numbers);
        return numbers;
    }

    private int getRandomNumber() {
        return RANDOM.nextInt(MAX_VALUE) + MIN_VALUE;
    }

    private boolean isNumberExist(int number, int[] numbers) {
        for (int j : numbers) {
            if (number == j) {
                return true;
            }
        }
        return false;
    }

    public String convertDaysToYears(long days) {
        int years = (int) (days / 365);
        int restDays = (int) (days % 365);
        return String.format("Count of years: %d, days: %d", years, restDays);
    }

}
