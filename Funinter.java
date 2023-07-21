@FunctionalInterface
interface A{
    void show(int i);
    
    
}
////class B implements A{
   // public void show(){
   //     System.out.println("in show:");
   // }
//}
public class Funinter {
    public static void main(String[] args) {
        //A obj= new A()
        //{
            //public void show(){
            //    System.out.println("in show");
          //  }
        //};

        A obj=(int i)->
            System.out.println("in show "+" "+i);
        
        obj.show(5); 
    }
    

}
