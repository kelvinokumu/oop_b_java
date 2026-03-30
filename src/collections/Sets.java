package collections;
import java.util.*;

public class Sets {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();
        names.add("Alice");
        names.add("Brian");
        names.add("Cate");
        names.add("Alice");
        names.add("Brian");
        names.add("Cate");

        System.out.println(names);

        for(String name : names){
            System.out.println(name);
        }
    }
}
