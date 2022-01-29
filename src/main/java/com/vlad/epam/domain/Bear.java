package com.vlad.epam.domain;

import com.vlad.epam.domain.interfaces.AnimalFeed;

public class Bear implements AnimalFeed<Malina> {
    @Override
    public boolean feed(Malina value) {
        System.out.println("Feeding the bear with ");
        return false;
    }
}
