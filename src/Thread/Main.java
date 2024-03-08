package Thread;
public class Main {
    public static void main(String[] args) {
        System.out.println("inside main thread Name: "+Thread.currentThread().getName());
        HelloWorldPrinter h = new HelloWorldPrinter();
        Thread thread = new Thread(h);
        thread.start();
        System.out.println("inside main thread Name: "+Thread.currentThread().getName());
    }
}