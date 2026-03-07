package week7;

public abstract class Court {
    String courtName;

    static int totalCases = 0;

    Court(String courtName){
        this.courtName = courtName;
    }

    void registerCase(){
        totalCases++;
        System.out.println("Case registers in "+courtName);
    }

    static void showTotalCases(){
        System.out.println("Total cases are :"+totalCases);
    }

    abstract void courtType();
}
