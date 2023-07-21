import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo {
    public static void main(String[] args) {
        LinkedHashMap hm= new LinkedHashMap<>();
        hm.put("name", "Harish");
        hm.put("dob", "22/06/1998");
        hm.put("address", "Harish");
        System.out.println(hm);

       // System.out.println(hm.isEmpty());
       // System.out.println(hm.get("name"));
    }
    
    
}
