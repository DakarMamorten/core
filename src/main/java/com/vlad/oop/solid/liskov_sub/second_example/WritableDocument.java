package com.vlad.oop.solid.liskov_sub.second_example;

public class WritableDocument extends Document implements SaveDocument{
    @Override
    public void save() {
        System.out.println("Document is save");
    }
}
