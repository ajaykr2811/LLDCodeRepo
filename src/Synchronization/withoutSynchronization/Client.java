package Synchronization.withoutSynchronization;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Adder adder = new Adder(counter);
        Subtrator subtrator = new Subtrator(counter);

        Thread adderThread = new Thread(adder);
        Thread subtratorThread = new Thread(subtrator);

        adderThread.start();
        subtratorThread.start();

        adderThread.join();
        subtratorThread.join();

        System.out.println(counter.count);
    }
}
