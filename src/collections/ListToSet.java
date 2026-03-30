package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Brian");
        names.add("Cate");
        names.add("Alice");
        names.add("Brian");
        names.add("Cate");

        Set<String> names2 = new HashSet<>(names);  // type cast list to set
        System.out.println(names2);

        ArrayList<String> names3 = new ArrayList<>(names2); // type cast set to list


    }
}
