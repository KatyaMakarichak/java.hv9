package com.example;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("Hello");
        System.out.println("ArrayList size: " + arrayList.size());

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        System.out.println("LinkedList get(1): " + linkedList.get(1));

        MyQueue<String> queue = new MyQueue<>();
        queue.add("first");
        queue.add("second");
        System.out.println("Queue peek: " + queue.peek());

        MyStack<Integer> stack = new MyStack<>();
        stack.push(100);
        stack.push(200);
        System.out.println("Stack pop: " + stack.pop());

        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        System.out.println("Map get('two'): " + map.get("two"));
    }
}