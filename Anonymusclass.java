class A{
    public void show()
    {
        System.out.println("in A show");
    }

}

public class Anonymusclass {
    public static void main(String[] args) {
        A obj= new A()
        {
            public void show()
            {
                System.out.println("in B new show");
            }
        };
        obj.show();
    }
    
    
}
