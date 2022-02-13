package com.vlad.oop.solid.liskov_sub.second_example;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Document implements OpenDocument{
    private LocalDateTime date;
    private String fileName;

    @Override
    public void open() {
        System.out.println("Document is open");
    }
}
