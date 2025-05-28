package com.example;

public class MyLinkedList<T> {
    private class Node {
        T value;
        Node prev, next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node head, tail;
    private int size = 0;

    public void add(T value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public T get(int index) {
        return getNode(index).value;
    }

    public void remove(int index) {
        Node node = getNode(index);
        if (node.prev != null) node.prev.next = node.next;
        else head = node.next;
        if (node.next != null) node.next.prev = node.prev;
        else tail = node.prev;
        size--;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current;
    }
}