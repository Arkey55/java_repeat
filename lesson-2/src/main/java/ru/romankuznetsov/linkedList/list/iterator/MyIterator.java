package ru.romankuznetsov.linkedList.list.iterator;

public interface MyIterator<T> {
    boolean hasNext();
    boolean hasPrevious();
    T next();
    T previous();
}
