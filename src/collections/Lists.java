package collections;

import java.util.ArrayList;  // importing ArrayList
import java.util.*;   // import everything from util package

public class Lists {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Brian");
        names.add("Cate");
        names.add("Alice");
        names.add("Brian");
        names.add("Cate");

        System.out.println(names);
//        names.add(1,"Evans");
//        System.out.println(names);
//
//        names.set(2,"Dennis");
//        System.out.println(names);
//
//        for (String name : names){
//
//            // db connection
////            fetch
//            System.out.println("Title " +name);
//        }
//
//        names.remove("Dennis"); // remove by object
//        names.remove(0);  // remove by index
    }
}
