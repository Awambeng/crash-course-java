package chapterfour;

public class Main {
    public final int add(){
        int a = (int)9l;
        return a;
    }
    public final static void main(String [] args){
        System.out.println("Hello World...");
        Main m = new Main();
        int sum = m.add() + 4; // prints 9 + 4 = 13
        System.out.println(sum);
        m.sum(2, 3);
    }

    // how to add several exceptions to your methods
    public void test() throws Exception, IllegalArgumentException, InterruptedException{
        // write some codes here...
    }

    public void greet(){}

    // working with varargs
    public void sum(int a, int ... args){ // note when using varargs in methods parameters make sure it should be the last argument and a method can take just one varargs at a time.
        int s = a + args[0];
        System.out.println(s);
    }

}

abstract class Test{
    public abstract void methodWithNoBody(); // method with no body (abstract method)
}
