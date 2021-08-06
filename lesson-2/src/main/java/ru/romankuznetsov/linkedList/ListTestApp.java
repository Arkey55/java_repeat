package ru.romankuznetsov.linkedList;


import ru.romankuznetsov.linkedList.list.MyLinkedList;
import ru.romankuznetsov.linkedList.list.MyList;
import ru.romankuznetsov.linkedList.list.iterator.MyIterator;

public class ListTestApp {
    public static void main(String[] args) {
        SomeElement element = new SomeElement();
        MyList list = new MyLinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add(element);

        System.out.println(list);
        System.out.println("Get: " + list.get(2));
        list.remove("B");
        System.out.println(list);

        MyIterator iter = list.iterator();
        while (iter.hasNext()){
            Object next = iter.next();
            System.out.println(next);
        }

        System.out.println("=======================");

        while (iter.hasPrevious()){
            Object prev = iter.previous();
            System.out.println(prev);
        }
        System.out.println("=======================");
        System.out.println(list.size());
    }
}
