package chapterfour.pond.duck;

public class MotherDuck {
    String noise = "quack";
    void quack(){
        System.out.println(noise); // default access is okay
    }

    private void makeNoise(){
        quack(); // default access is okay
    }
}
