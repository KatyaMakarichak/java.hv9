package com.example;

public class MyQueue<T> {
    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (tail != null) tail.next = newNode;
        tail = newNode;
        if (head == null) head = newNode;
        size++;
    }

    public T peek() {
        return head != null ? head.value : null;
    }

    public T poll() {
        if (head == null) return null;
        T value = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return value;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }
}