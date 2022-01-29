package com.vlad.epam.generic;

public class Container<T extends Number> {
    private int size;
    private Object[] array;

    public Container() {
        size = 0;
        array = new Object[10];
    }

    public Container(int length) {
        size = 0;
        array = new Object[length];
    }

    public void addElement(T element) {
        array[size] = element;
        size++;
    }

    public int getSize() {
        return size;
    }

    public T getByIndex(int index) {
        return (T) array[index];
    }
}
