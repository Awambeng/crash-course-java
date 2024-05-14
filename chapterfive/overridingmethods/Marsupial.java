package chapterfive.overridingmethods;

public class Marsupial {
    public boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped() + " " + greet());
    }

    public String greet(){
        return "Hello from parent class";
    }
}
