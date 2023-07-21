import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {

        HashSet<String> hs= new HashSet<>();
        hs.add("harish");
        hs.add("suresh");
        hs.add("geetha");
        hs.add("rekha");
        System.out.println(hs.contains("harish"));

        for(String s: hs){
           System.out.println(s); 
        }

    }
    
}
