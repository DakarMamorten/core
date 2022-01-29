package com.vlad.epam.domain;

import com.vlad.epam.domain.interfaces.AnimalFeed;
import com.vlad.epam.domain.interfaces.First;
import com.vlad.epam.domain.interfaces.Second;

import java.util.ArrayList;
import java.util.List;

public class Main implements Second, First {
    public static void main(String[] args) {
        List<AnimalFeed> list = new ArrayList<>();
        list.add(new Bear());
        list.add(new Fox());
//        list.add(new Rabbit());

        System.out.println();
    }
}

