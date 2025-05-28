package com.example;

public class MyStack<T> {
    private Object[] data;
    private int size;

    public MyStack() {
        data = new Object[10];
        size = 0;
    }

    public void push(T value) {
        ensureCapacity();
        data[size++] = value;
    }

    public T peek() {
        return size > 0 ? (T) data[size - 1] : null;
    }

    public T pop() {
        if (size == 0) return null;
        T value = (T) data[--size];
        data[size] = null;
        return value;
    }

    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
    }

    public void clear() {
        data = new Object[10];
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

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}