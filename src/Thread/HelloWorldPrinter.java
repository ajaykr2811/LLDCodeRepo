package Thread;
public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("inside HWP class Thread name: "+ Thread.currentThread().getName());
    }
}
