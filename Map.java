import java.util.*;


public class Map {
    public static void main(String[] args) {
       HashMap<String, Integer> students= new HashMap<String, Integer>();

       students.put("Harish", 56);
       students.put("mahe", 96);
       students.put("giri", 78);
       students.put("suresh", 39);
       
       students.put("suresh", 99);

       //System.out.println(students.keySet());

        for(String key: students.keySet()){
            System.out.println(key +" "+students.get(key));
        }

      System.out.println (students.get(students));
       
        
    }
    
}
