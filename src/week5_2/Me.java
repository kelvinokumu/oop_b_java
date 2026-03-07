package week5_2;

public class Me implements All {

    public void display(){
        System.out.println("First");
    }

    public void getDetails(){
        System.out.println("Second");
    }

    public static void main(String[] args){
        Me m = new Me();
        m.getDetails();
    }
}
