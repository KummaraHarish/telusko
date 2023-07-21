public class Excep {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int num[]=new int[4];
        String str=null;
         try{
            j=18/i;
           System.out.println(num[5]);
            System.out.println(str.length());
         }
         
         catch(ArithmeticException e){
            System.out.println("number can't didvide by zero" + e);
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the limit is high." +e);
         }
         catch(NullPointerException e){
            System.out.println("lenght is high " +e);
         }
         catch(Exception e){
            System.out.println("Something went wrong " + e);
         }
         System.out.println(j);
         System.out.println("bye");
    }
    
}
