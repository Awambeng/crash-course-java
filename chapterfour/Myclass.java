package chapterfour;

public class Myclass {
    public static void walk(int start, int ... args){
        System.out.println(args.length); // prints the number of arguments passed in the varargs. 
    }
    public static void main(String ... args){
        Main m = new Main();
        int sum = m.add() + 1;
        System.out.println(sum);

        // working with varargs
        walk(1); // prints 0
        walk(1, 2); // prints 1
        walk(1, 2, 3); // prints 2
        walk(1, new int[] {4, 5, 3}); // prints 3
    }
}
