package com.vlad.web.dvdrental.menu;

public class FilmMenu implements AbstractMenu {
    @Override
    public void show() {

        System.out.println("fa - Show all films");
        System.out.println("ac - Add film");
        System.out.println("0 - Back to main menu");
    }
}
