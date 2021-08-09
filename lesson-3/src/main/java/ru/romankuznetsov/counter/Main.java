package ru.romankuznetsov.counter;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock();
        new Thread(new Counter(lock)).start();
        new Thread(new Counter(lock)).start();
        new Thread(new Counter(lock)).start();
        new Thread(new Counter(lock)).start();

    }
}
