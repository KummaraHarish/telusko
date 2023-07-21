public class LinkedList {
    public static void main(String[] args) {
        LinkedList <Student> ll= new LinkedList<>();

        ll.add(new Student(34));
        for(Student s: ll){
            System.out.println(s);
        }

    }
    
}

Class Student{
    int rollNo;
    LinkedList(int rollNo){
        this.rollNo=rollNo;
    }

    
}
