enum Status{
    Running, Failed, Pending, Success;
}
public class enm {
    
    public static void main(String[] args) {
        int i=5;
        //Status s= Status.Running;
        //System.out.println(s);
        //System.out.println(s.ordinal());

        Status[] ss= Status.values();

        for(Status s: ss){
            System.out.println(s+" "+s.ordinal());
        }
        
    }
    
}
