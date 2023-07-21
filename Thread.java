class A extends Thread{

    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hi");
        }
    }
}
class B extends Thread{

    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hello");
            Thread.sleep()
        }
    }

    public void setPriority(String maxPriority) {
    }

    
}
public class Thread {
    private static final String MAX_PRIORITY = null;

    public static void main(String[] args) {
        A obj1= new A();
        B obj2= new B();

        obj2.setPriority(Thread.MAX_PRIORITY);
       obj1.run();
       obj2.run();
    }

    public static void sleep() {
    }
    
}
