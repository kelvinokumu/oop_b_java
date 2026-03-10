package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInput {
    public static void main(String[] args){
        System.out.println("Start");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name ");
        String name = sc.next();

        try{
            System.out.println("Enter number ");
            int num;
            num = sc.nextInt();
        } catch(InputMismatchException msg){
            System.out.println(msg); // catching the error
            sc.next(); // clearing wrong input
        }

        System.out.println("Enter true or false");
        boolean flag = sc.nextBoolean();

        System.out.println("Enter balance");
        Double balance = sc.nextDouble();

    }
}
