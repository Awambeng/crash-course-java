package chapterfive.overridingmethods;

public class Wolf extends Canine{
    public double getAverageWeight(){
        // return getAverageWeight(); // infinite loop since method is calling itself (produces a stack overflow at runtime since the function calls itself and has no ending condition to stop the call)
        return super.getAverageWeight() + 20; // calling method from parent class.
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}
