package chapterfour;

public class OverLoadConstructor {
    private String color;
    private int weight;
    private int count;

    public OverLoadConstructor(int weight, int count){ // first constructor.
        // this.weight = weight;
        // color = "brown";
        this(2, "black");
        this.count = count;
    }

    public OverLoadConstructor(int weight, String color){ // second constructor.
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        OverLoadConstructor o = new OverLoadConstructor(4, 3);
        System.out.println(o.color + o.weight + o.count);
    }
}
