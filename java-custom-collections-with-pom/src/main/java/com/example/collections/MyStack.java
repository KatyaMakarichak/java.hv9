package com.example.collections;

public class MyStack<T> {
    private Object[] data;
    private int size = 0;

    public MyStack() {
        data = new Object[10];
    }

    public void push(T value) {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
        data[size++] = value;
    }

    public T peek() {
        if (size == 0) return null;
        return (T) data[size - 1];
    }

    public T pop() {
        if (size == 0) return null;
        T value = (T) data[--size];
        data[size] = null;
        return value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }
}
