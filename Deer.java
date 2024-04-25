public class Deer {
    public Deer(){
        System.out.println("Deer");
    }
    public Deer(int age){
        System.out.println("DeerAge");
    }

    public boolean hasHorns(){return false;}

    public static void main(String [] args){
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }
}

class Reindeer extends Deer{
    public Reindeer(int age){
        System.out.println("Reindeer");
    }

    public boolean hasHorns(){return true;}
}

class FeedingSchedule {
     public static void main(String[] args) {
     int x = 5, j = 0;
     OUTER: for(int i=0; i<3; )
        INNER: do {
            i++; x++;
            if(x > 10) break INNER;
            x += 4;
            j++;
        } while(j <= 2);
     System.out.println(x);
     } 
}