package chapterfour.pond.duck;

public class FatherDuck {
    private String noise = "quack";
    private void quack(){
        System.out.println(noise); // private access is okay
    }

    private void makeNoise(){
        quack(); // private access is okay
    }
}
