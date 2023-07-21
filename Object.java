class Computer{
  public  void playMusic(){
    System.out.println("play music lala");

    }

    public String getMePen(int cost){
        if(cost>=10)
        return "Pen";
        
        return "Nothing";
    } 
}

public class Object {
    
    public static void main(String[] args) {
        Computer com= new Computer();
        com.playMusic();
       String str= com.getMePen(20);
       
        System.out.println(str);
    }

    public void start() {
    } 
}
