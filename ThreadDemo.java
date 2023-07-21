public class ThreadDemo  extends Thread{
    public void run(){
        System.out.println("thread class is overide by jvm");
    }
    public static void main(String[] args) {
        ThreadDemo td= new ThreadDemo();
        Thread t= new Thread(td);
        t.start();
    }
    
}
