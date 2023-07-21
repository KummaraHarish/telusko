interface A{
    int age=10;
    String area="Bangalore";
    void show();
    void config();
}
class B implements A{
   public void show(){
    System.out.println(" showing ");

    }
    public void config(){
        System.out.println("in config");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        A obj= new B();
        obj.show();
        obj.config();
        
        System.out.println(A.age);
        System.out.println(A.area);
    }
    
}
