import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionInterface {
    public static void main(String[] args) {
        Set <Integer> nums= new TreeSet<Integer>();
        nums.add(62);
        nums.add(45);
        nums.add(82);
        nums.add(97);
        nums.add(62);

        
        //nums.add("5");
        //nums.get(2)
        //System.out.println(nums.get(2));
       // System.out.println(nums.indexOf(8));
        
        for(int n: nums)
       {
       System.out.println(n);
   }

    //for(int k:nums){
       // System.out.println(k);
   // }

     
    }
    
}
