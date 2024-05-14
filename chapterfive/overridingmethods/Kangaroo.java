package chapterfive.overridingmethods;

public class Kangaroo extends Marsupial{
    public boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped() + " " + greet());
    }

    public String greet(){
        return "Hello from child's class";
    }
    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
}
