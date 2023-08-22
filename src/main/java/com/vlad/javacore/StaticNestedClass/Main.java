package com.vlad.javacore.StaticNestedClass;

public class Main {
    public static void main(String[] args) {
        OuterClass.NestedClass on = new OuterClass.NestedClass("Hello");
        on.printText();
    }
}
