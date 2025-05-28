package com.example;

public class MyStack<T> {
    private Object[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyStack() {
        data = new Object[INITIAL_CAPACITY];
    }

    public void push(T value) {
        ensureCapacity();
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
        for (int i = index; i < size - 1; i++) data[i] = data[i + 1];
        data[--size] = null;
    }

    public void clear() {
        data = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }
}