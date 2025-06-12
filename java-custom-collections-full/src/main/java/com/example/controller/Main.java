package com.example.controller;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        System.out.println("ArrayList size: " + arrayList.size());

        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        System.out.println("LinkedList get(1): " + linkedList.get(1));

        MyQueue<String> queue = new MyQueue<>();
        queue.add("first");
        queue.add("second");
        System.out.println("Queue peek: " + queue.peek());

        MyStack<String> stack = new MyStack<>();
        stack.push("top");
        System.out.println("Stack peek: " + stack.peek());

        MyHashMap<String, String> map = new MyHashMap<>();
        map.put("key", "value");
        System.out.println("HashMap get(key): " + map.get("key"));
    }
}
