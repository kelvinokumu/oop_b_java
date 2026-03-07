package week5;

public class Main {
    public static void main(String[] args){
        System.out.println("Start");

        Student st1 = new Student("Jane","jane@gmail1.com", "1478");   // calls constructor on object creation
        String studentname = st1.getName();
        String studentemail = st1.getEmail();
        
        System.out.println(studentname);
        System.out.println(studentemail);
        // st.attendLecture();
        // Student.ChangeCourse();

        Person p1 = new Person("John","p@gmail.com");
    }
    
}
