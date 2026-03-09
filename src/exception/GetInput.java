package exception;

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
        } catch(Exception msg){
            System.out.println(msg);
        }

        System.out.println("End");

//        System.out.println("Enter true or false");
//        boolean flag = sc.nextBoolean();
//
//        System.out.println("Enter balance");
//        Double balance = sc.nextDouble();

    }
}
