package Synchronization.LockandUnlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(counter,lock);
        Subtrator subtrator = new Subtrator(counter,lock);

        Thread adderThread = new Thread(adder);
        Thread subtratorThread = new Thread(subtrator);

        adderThread.start();
        subtratorThread.start();

        adderThread.join();
        subtratorThread.join();

        System.out.println(counter.count);
    }
}
