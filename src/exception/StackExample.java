package exception;

public class StackExample {
    static int counter = 0;
    public static void main(String[] args){
        fB();
    }

//    public static void fA(){
//        counter++;
//        System.out.println(counter);
//        fA();
//    }

    public static void fB(){
        for (int i = 0;i< 60000;i++){
            System.out.println(i);
        }
    }
}
