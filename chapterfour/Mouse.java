package chapterfour;

public class Mouse {
    private int numTeeth;
    private int numWhiskers;
    private int weight;

    public Mouse(int weight){
        this(weight, 16); // calls constructor with 2 parameters
    }

    public Mouse(int weigth, int numTeeth){
        this(weigth, numTeeth, 6); // calls constructor with 3 parameters
    }

    public Mouse(int weigth, int numTeeth, int numWhiskers){
        this.weight = weigth;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print(){
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    } 

    public static void main(String[] args) {
        Mouse m = new Mouse(15);
        m.print();
    }
}
