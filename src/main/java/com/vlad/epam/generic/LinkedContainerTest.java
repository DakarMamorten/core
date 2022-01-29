package com.vlad.epam.generic;

public class LinkedContainerTest {
    public static void main(String[] args) {
        LinkedContainer<String> stringLinkedContainer = new LinkedContainer<>();
        System.out.println(stringLinkedContainer.size());
        stringLinkedContainer.add("Sss");
        stringLinkedContainer.add("Sss222");
        stringLinkedContainer.add("Sss333");
        System.out.println(stringLinkedContainer.size());
//        System.out.println(stringLinkedContainer.getFirst());
//        System.out.println(stringLinkedContainer.getLast());
        stringLinkedContainer.print();
    }
}
