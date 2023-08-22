package com.vlad.javacore.StaticNestedClass;

public class OuterClass {
    private String text;
    private static int number = 10;
    public OuterClass(String text) {
        super();
        this.text = text;
    }
    public static class NestedClass {
        private String word;
        public NestedClass(String word) {
            super();
            this.word = word;
        }
        public void printText() {
            System.out.println(word + " " + number);
        }
    }
}
