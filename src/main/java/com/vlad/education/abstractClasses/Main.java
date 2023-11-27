package com.vlad.education.abstractClasses;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();
        BigOrange bigOrange = new BigOrange();

        fruit = citrus;
        citrus = orange;
        orange = bigOrange;

//        citrus = fruit;

        List<? extends Citrus> citruses = new ArrayList<>();
        fruit = citruses.get(0);
        citrus = citruses.get(0);
//        orange = citruses.get(0);


        List<Orange> oranges = new ArrayList<>();
//        oranges.addAll(citruses);
//        fruit.totalWeight(citruses);

    }
}
