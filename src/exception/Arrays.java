package exception;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many names do you want ");
        int size = sc.nextInt();
        String[] names = new String[size];

        for (int i = 0;i < size;i++){
            names[i] = sc.next();
        }

        for (int i = 0;i <= size;i++){
            System.out.println(names[i]);
        }
    }
}
