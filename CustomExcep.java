package other;
class HarishException extends RuntimeException
 {
    public HarishException(String string){
        super(string);
    }
 }
public class CustomExcep {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0)
            throw new HarishException("i dont want output as zero");

        }catch(HarishException e){
            j=18/1;
            System.out.println("something went wrong "+ e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
    
}
