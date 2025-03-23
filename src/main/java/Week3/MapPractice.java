package Week3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> scores = new LinkedHashMap<>();

        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        Iterator<String> iterator = scores.keySet().iterator();

        while(iterator.hasNext()){
            String studentName = iterator.next();
            Integer grade = scores.get(studentName);
            System.out.println(studentName + " " + grade);
        }

    }




}
