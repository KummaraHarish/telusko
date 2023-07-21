
import java.util.*;

public class Collection {
    public static void main(String[] args) {
        List<String> al= new ArrayList<>();
        al.add("Hari");
        al.add("25");
        al.add("mahesh");
        al.add("ganesh");
        al.add("hshs");
        al.add(2, "samsung");
        al.add("Hari");
        al.set(0, "gg");


        //for(String s: al){
            //System.out.println(s);
        //}
        //for(int i=0;i<al.size();i++){
           // System.out.println(al.get(i));
        //}

       // System.out.println(al);
       // System.out.println("hi");

       al.forEach(a->{
        System.out.println(a);
       });

       System.out.println(al.isEmpty());

       System.out.println(al.lastIndexOf("hss"));
       System.out.println(al.contains("Hari"));
    }
    
}
