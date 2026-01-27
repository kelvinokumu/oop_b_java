package week3;

import java.util.Scanner;

public class GetInputs {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){


        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("The name is "+name);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("The number is "+num);

        // BufferReader br = new BufferReader(new InputStreamReader(System.in));
    }

    public static String getNames(){


        System.out.println("Enter name ");
        String userName = sc.next();

        return userName;
    }

    
}
