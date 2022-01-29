package com.vlad.epam.domain;

import com.vlad.epam.domain.interfaces.AnimalFeed;

public class Fox implements AnimalFeed<Chicken> {
    @Override
    public boolean feed(Chicken value) {
        System.out.println("Feeding the fox with ");
        return false;
    }
}
