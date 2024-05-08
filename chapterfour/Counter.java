package chapterfour;

public class Counter {
    private static int count = 0;

    public Counter(){
        count++;
    }

    public static void main(String[] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        System.out.println(count); // prints 5
        System.out.println(c1.count); // prints 5
        System.out.println(c2.count); // prints 5
        System.out.println(c3.count); // prints 5
        System.out.println(c4.count); // prints 5
        System.out.println(c5.count); // prints 5
    }
}
