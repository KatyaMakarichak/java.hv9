package com.example.controller;

import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] data = new Object[10];
    private int size = 0;

    public void add(T value) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = value;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (T) data[index];
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
    }

    public void clear() {
        Arrays.fill(data, 0, size, null);
        size = 0;
    }

    public int size() {
        return size;
    }
}
