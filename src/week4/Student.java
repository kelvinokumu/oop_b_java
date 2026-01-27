package week4;

public class Student {
    private String userName; // instance variables
    private int admnNo;
    private String email;
    private int age;

    public Student(String name, int admnNo, String email, int age){
        this.userName = name;
        this.admnNo = admnNo;
        this.email = email;
        // this.age = age;
        setAge(age);
    }

    public void setAge(int age){   // setter
        if(age > 17){
            this.age = age;
        } else {
            System.out.println("Wrong age");
        }
    }

    public void getAge(){  // getter
        System.out.println(this.age);
        // return this.age;
    }

    // public void withdraw(int amount){
    //     if(amount > 0 && amount < this.amount){
    //         this.amount = this.amount - amount;
    //         // this.amount -= amount;
    //     }
    // }
    
}
