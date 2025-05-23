package com.example.collections;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println("ArrayList: " + arrayList.get(0) + ", " + arrayList.get(1));

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println("LinkedList: " + linkedList.get(0) + ", " + linkedList.get(1));

        MyQueue<String> queue = new MyQueue<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue peek: " + queue.peek());
        System.out.println("Queue poll: " + queue.poll());

        MyStack<String> stack = new MyStack<>();
        stack.push("Top");
        stack.push("Bottom");
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());

        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("Map get A: " + map.get("A"));
    }
}
