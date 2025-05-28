package com.example;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("Hello");
        System.out.println("MyArrayList: " + arrayList.get(0));

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(123);
        System.out.println("MyLinkedList: " + linkedList.get(0));

        MyQueue<String> queue = new MyQueue<>();
        queue.add("First");
        System.out.println("MyQueue peek: " + queue.peek());

        MyStack<String> stack = new MyStack<>();
        stack.push("Top");
        System.out.println("MyStack peek: " + stack.peek());

        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("key", 42);
        System.out.println("MyHashMap get: " + map.get("key"));
    }
}