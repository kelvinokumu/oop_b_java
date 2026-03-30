package collections;
import java.util.*;

public class Maps {
    public static void main(String[] args){
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Jay",98);
        marks.put("Jane",68);
        marks.put("Jason",78);
        marks.put("Jannet",88);

        System.out.println(marks.get("Jay"));

        boolean flag = marks.containsKey("Jane"); // check if the key exists
        System.out.println(flag);

    }
}
