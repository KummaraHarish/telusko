 abstract class Car{
    public  abstract void drive();

    

    public void playMusic(){
        System.out.println("playing music enjoy!");
    }
}
class Bmw extends Car{
    public  void drive(){
        System.out.println("driving hoooo");
    }
}
public class Abstr {
    public static void main(String[] args) {
        Car obj= new Bmw();
        obj.drive();
        obj.playMusic();
        
    }
    
}
