package com.vlad.web.dvdrental.menu;

public class MainMenu implements AbstractMenu {
    @Override
    public void show() {
        System.out.println("        Hello           ");
        System.out.println("c - Category");
        System.out.println("a - Actors");
        System.out.println("f - Films");
        System.out.println("e - Exit");
    }
}
