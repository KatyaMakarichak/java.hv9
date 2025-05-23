package com.example.collections;

public class MyQueue<T> {
    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public void add(T value) {
        Node newNode = new Node(value);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
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
        while (head != null) {
            Node next = head.next;
            head.next = null;
            head = next;
        }
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }
}
