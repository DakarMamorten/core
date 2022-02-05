package com.vlad.web.dvdrental.menu;

public class CategoryMenu implements AbstractMenu {
    @Override
    public void show() {
        System.out.println("sc - Show all categories");
        System.out.println("ac - Add category");
        System.out.println("af -Search film by category");
        System.out.println("adf -Add film to category");
        System.out.println("0 - Back to main menu");
    }
}
