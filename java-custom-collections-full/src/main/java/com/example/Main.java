package com.example;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        arrayList.remove(0);
        System.out.println(arrayList.get(0));
    }
}
