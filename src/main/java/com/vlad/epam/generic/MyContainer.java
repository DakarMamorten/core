package com.vlad.epam.generic;

public class MyContainer<T> {
    private int size;
    private Object[] arr;

    public MyContainer() {
        size = 0;
        arr = new Object[10];
    }

    public void add(T element) {
        resize();
        arr[size] = element;
        size++;
    }

    public void add(int index, T element) {
        resize();
        if (size < index) {
            Object[] arr2 = new Object[arr.length +1];
            System.arraycopy(arr, 0, arr2, 0, size);
            arr = arr2;
        }
        if (arr[index] == null) {
            arr[index] = element;
        }else {
            System.arraycopy(arr, index, arr, index + 1, size - index);
        }
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    public void print() {
        for (Object o : arr) {
            if (o != null) {
                System.out.print(o + " ");
            }
        }
    }

    private void resize() {
        if (size == arr.length) {
            Object[] arr2 = new Object[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, size);
            arr = arr2;
        }
    }

    public void remove(int index) {
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        size--;
        arr[size] = null;
    }
}


