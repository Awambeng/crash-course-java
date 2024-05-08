package chapterfour.pond.shore;

public class BirdWatcher {
    public void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater(); // calling protected method in thesame package
        System.out.println(bird.text); // calling protected instance variable in thesame package.
    }

    public static void main(String[] args) {
        BirdWatcher b = new BirdWatcher();
        b.watchBird();
    }
}
