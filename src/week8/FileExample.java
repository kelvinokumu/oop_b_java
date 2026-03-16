package week8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileExample {
    public static void main(String[] args) {

        try{
            File f1 = new File("students.txt");
            if(f1.createNewFile()){
                System.out.println("New file created");
            } else {
                System.out.println("File already exists ");
            }

            String filepath = f1.getAbsolutePath();
            System.out.println("The file path is "+filepath);

            FileWriter fileWriter = new FileWriter(f1);
            fileWriter.write("Java \n");
            fileWriter.write("Kotlin \n");
            fileWriter.write("Assembly \n");
            fileWriter.close();
//            fileWriter.flush();

            System.out.println("Reading from the same file");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String line;
            // check if there is something to be printed/displayed
            while((line = br.readLine()) != null){
                System.out.print(line);
            }
            br.close();
            System.out.println("Done reading");

        }catch(Exception msg){
            System.out.println("Error "+msg);
        }
    }
}
