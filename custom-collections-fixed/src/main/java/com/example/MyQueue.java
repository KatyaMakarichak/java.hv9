package com.example;

public class MyQueue<T> {
    private class Node {
        T value;
        Node next;
        Node(T value) { this.value = value; }
    }

    private Node head, tail;
    private int size = 0;

    public void add(T value) {
        Node node = new Node(value);
        if (tail != null) tail.next = node;
        tail = node;
        if (head == null) head = node;
        size++;
    }

    public T peek() {
        if (head == null) return null;
        return head.value;
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