import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> ls= new LinkedHashSet<>();
        ls.add(10);
        ls.add(5);
        ls.add(24);
        ls.add(15);
        ls.add(12);
        ls.add(10);

        for(Integer i: ls){
            System.out.println(i);
        }
    }
    
}
