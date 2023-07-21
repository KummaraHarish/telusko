import java.util.jar.Manifest;

public class Mobile {
    String brand;
    int price;
    static  String name;

    public void show(){
        System.out.println(brand+" : "+ price+ " : "+ name);
    }
    public static void main(String[] args) {
        Mobile m1= new Mobile();
        m1.brand="iphone";
        m1.price=1500;
        Mobile.name="SmartPhone";
        

        Mobile m2= new Mobile();
        m2.brand="samsung";
        m2.price=1100;
        Mobile.name="ABC";
      

        

        m1.show();
        m2.show();
        
    }

    
}
