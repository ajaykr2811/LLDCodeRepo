package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try{
            int x = scn.nextInt();
            int y = scn.nextInt();

            System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println("Please provide only int values");
        }
        catch (ArithmeticException e){
            System.out.println("infinite");
        }

    }
}
