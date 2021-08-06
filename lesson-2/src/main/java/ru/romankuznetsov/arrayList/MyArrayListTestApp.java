package ru.romankuznetsov.arrayList;


public class MyArrayListTestApp {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
