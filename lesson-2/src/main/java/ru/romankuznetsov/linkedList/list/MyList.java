package ru.romankuznetsov.linkedList.list;

import ru.romankuznetsov.linkedList.list.iterator.MyIterable;

public interface MyList<T> extends MyIterable {
    void add(T val);
    boolean remove(T val);
    int size();
    T get(int index);
}
