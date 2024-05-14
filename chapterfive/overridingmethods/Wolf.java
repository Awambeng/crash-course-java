package chapterfive.overridingmethods;

public class Wolf extends Canine{
    public double getAverageWeight(){
        // return getAverageWeight(); // infinite loop since method is calling itself (produces a stack overflow at runtime since the function calls itself and has no ending condition to stop the call)
        return super.getAverageWeight() + 20; // calling method from parent class.
    }

    @Override
    protected int addTwoNumbers(int a, int b){
        return a + b + 10;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());

        // implementing the method overriding rules
        System.out.println(new Canine().addTwoNumbers(2, 3)); // 5
        System.out.println(new Wolf().addTwoNumbers(2, 3)); // 15
    }
}
