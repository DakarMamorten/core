package com.vlad.epam.generic;

public class LinkedContainer<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedContainer() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        if (first == null && last == null) {
            first = last = Node.valueOf(value);
        } else {
            Node<T> newValue = Node.valueOf(value);
            last.next = newValue;
            last = newValue;
        }
        size++;
    }

    public void print() {
        Node<T> currEll = first;
        for (int i = 0; i < size; i++) {
            System.out.println(currEll.value);
            currEll = currEll.next;

        }
    }

    public T getFirst() {
        return first.value;
    }

    public T getLast() {
        return last.value;
    }


    static class Node<T> {
        private T value;
        private Node<T> next;

        private Node(T value) {
            this.value = value;
        }


        public static <T> Node<T> valueOf(T value) {
            return new Node<>(value);
        }
    }
}
