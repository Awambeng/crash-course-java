package chapterfour;

public class Bunny {
    private String color;
    private int height;
    private int length;

    public Bunny(int height, int theLength){
        this.color = "white"; // initializing the instance variable in the constructor.
        height = this.height;
        length = theLength;
    }

    public static void main(String[] args) {
        Bunny b = new Bunny(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);
    }
}
