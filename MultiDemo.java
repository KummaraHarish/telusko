public class MultiDemo implements Runnable  {
    String name;
    MultiDemo(String name1){
        String name=name1;
    }
    public void run(){
        for(int i=1;i<10;i++){
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.print(e);
            }
            System.out.println(name +":"+ i);
        }
    }
    public static void main(String[] args) {
        MultiDemo m1= new MultiDemo("Thread1");
        MultiDemo m2= new MultiDemo("Thread2");

        Thread t1= new Thread(m1);
        Thread t2= new Thread(m2);

        t1.start();
        t1.join();
        t2.start();

    }
    
}
