package com.vlad.web.dvdrental.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActorService {
    private static final List<Actor> list = new ArrayList<>();

    public ActorService() {
        initData();
    }

    public static List<Actor> finAll() {
        return list;
    }

    public List<Actor> findByName(String name) {
        return list.stream()
                .filter(x -> x.getName().equals(name))
                .collect(Collectors.toList());
    }

    public void addActor(Actor actor) {
        list.add(actor);
    }

    private void initData() {
        list.add(new Actor("Jonh", 32));
        list.add(new Actor("Mikki", 23));
        list.add(new Actor("Jim", 44));
    }
}
