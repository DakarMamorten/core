package com.vlad.epam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Zero");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("Two")) {
                iterator.remove();
            }
            System.out.println(next);
        }
        System.out.println(list);
    }
}
