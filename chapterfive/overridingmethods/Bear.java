package chapterfive.overridingmethods;

public class Bear {
    public static void eat() {
        System.out.println("Bear is eating...");
    }

    public static boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}
