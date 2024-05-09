package chapterfour;

public class PassByValueExample {
    public static void main(String[] args) {
        int original1 = 1;
        int original2 = 2;

        swap(original1, original2);

        System.out.println("original1 = a: " + original1);
        System.out.println("original2 = b: " + original2);
    }

    /* java is a language that supports pass-by-value.
     * when dealing with primitives, when you pass a variable to a method any changes made
     * to that variable remains only within that method since java simply created a copy of that 
     * variable then parsing it to the method so any changes made to the variable in that method
     * doesn't affect the original variable outside the method. The example above demonstrates that.
     * 
     * 
     * When dealing with referenced types a change made to the variable inside the method affects
     * the initial variable outside the method since when a copy of the reference type is created and
     * parsed to the method they both point to thesame object so changing the reference variable
     * in the method affects the one outside.
     */

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
