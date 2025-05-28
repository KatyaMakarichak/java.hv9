package com.example;

public class MyHashMap<K, V> {
    private static class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int CAPACITY = 16;
    private Node<K, V>[] buckets;
    private int size = 0;

    public MyHashMap() {
        buckets = new Node[CAPACITY];
    }

    public void put(K key, V value) {
        int index = index(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    public V get(K key) {
        int index = index(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = index(key);
        Node<K, V> current = buckets[index];
        Node<K, V> prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) buckets[index] = current.next;
                else prev.next = current.next;
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {
        buckets = new Node[CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    private int index(K key) {
        return Math.abs(key.hashCode() % CAPACITY);
    }
}