public class Computer {

    public int  score(int team1, int team2)
    {
        int total=team1+team2;
        return total;
    }
    public static void main(Str[] args) {
        Computer cs= new Computer();
       int finalscore= cs.score(10, 20);
       System.out.println(finalscore);
    }
    
}
