package com.vlad.epam.domain.interfaces;

import com.vlad.epam.domain.Food;

public interface AnimalFeed<T extends Food> {
    boolean feed(T element);
}
