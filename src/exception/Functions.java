package exception;

public class Functions {
    public static void main(String[] args){
        System.out.println("Start main");
        fA();
        System.out.println("End main");
    }

    public static void fA(){
        System.out.println("Start A");
        fB();
        System.out.println("End A");
    }

    public static void fB(){
        System.out.println("Strat B");
        fC();
        System.out.println("End B");
    }

    public static void fC(){
        System.out.println("Start C");
        System.out.println("End c");
        fC();
    }
}
