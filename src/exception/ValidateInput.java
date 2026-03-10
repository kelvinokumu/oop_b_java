package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        boolean valid = false;
        while(!valid){
            try{
                System.out.println("Enter a number ");
                num = sc.nextInt();
                valid = true;
            }catch(Exception msg){
                System.out.println(msg);
                System.out.println("Wrong input");
                sc.next();
            }
        }
        System.out.println("The input provided is "+num);
    }
}
