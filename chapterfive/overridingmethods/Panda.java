package chapterfive.overridingmethods;

public class Panda extends Bear{
  
    public static void eat(){
        System.out.println("Pandas bear is chewing");
    }

    public static boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }

    public static void main(String[] args) {
        Panda.eat();
        Panda p = new Panda();
        p.getKangarooDescription();
        p.getMarsupialDescription();
    }
}
