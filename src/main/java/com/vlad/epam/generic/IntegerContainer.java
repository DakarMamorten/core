package com.vlad.epam.generic;

public class IntegerContainer {
    private int size;
    private Integer[] array;

    public IntegerContainer() {
        size = 0;
        array = new Integer[10];
    }

    public void addElement(Integer element) {
        array[size] = element;
        size++;
    }

    public int getSize() {
        return size;
    }

    public Integer getByIndex(int index) {
        return array[index];
    }
}
