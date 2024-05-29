package chapterfive.javapolymorphism;

public class Peacock extends Bird{
    public String getName(){
        return "peacock";
    }

    public static void main(String[] args) {
        Bird b = new Peacock();
        b.displayInformation();
    }
}
