package com.vlad.epam.generic;

public class KeyValueContainer<K extends Number, V> {
    private Object[] keys;
    private Object[] values;
    private int size;

    public KeyValueContainer() {
        keys = new Object[10];
        values = new Object[10];
        size = 0;
    }

    public void add(K key, V value) {
        if (!isExist(key)) {
            keys[size] = key;
            values[size] = value;
            size++;
        }
    }

    public V get(K key) {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].equals(key)) {
                return (V) values[i];
            }
        }
        return null;
    }

    public V delete(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                Object deleteElement = values[i];
                keys[i] = null;
                values[i] = null;
                return (V) deleteElement;
            }
        }
        return (V) values;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] != null) {
                stringBuilder
                        .append(keys[i])
                        .append(" ---> ")
                        .append(values[i])
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public int size() {
        return size;
    }

    private boolean isExist(K key) {
        for (int i = 0; i < size; i++) {
            if (keys[i].equals(key)) {
                return true;
            }
        }
        return false;
    }
}
