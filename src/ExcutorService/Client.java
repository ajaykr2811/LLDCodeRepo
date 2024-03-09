package ExcutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        int number = 100;

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for(int i=1;i<number;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.submit(numberPrinter);
            if(i==50){
                System.out.println("Stop");
            }
        }

        executorService.shutdown();
    }
}
