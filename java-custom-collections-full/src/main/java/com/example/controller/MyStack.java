package com.example.controller;

public class MyStack<T> {
    private Node<T> top;
    private int size = 0;

    public void push(T value) {
        Node<T> node = new Node<>(value);
        node.next = top;
        top = node;
        size++;
    }

    public T peek() {
        return top != null ? top.value : null;
    }

    public T pop() {
        if (top == null) return null;
        T val = top.value;
        top = top.next;
        size--;
        return val;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            pop();
            return;
        }

        Node<T> current = top;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        size--;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }
}
