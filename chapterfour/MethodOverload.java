package chapterfour;

public class MethodOverload {

    public static void sound(String sound){
        System.out.println("roars");
    }

    public static void sound(int num, String sound){
        System.out.println("roars " + num + " times");
    }
    public static void main(String[] args) {
        MethodOverload.sound("roars");
        MethodOverload.sound(5, "roars");

        MethodOverload m = new MethodOverload();
        m.fly(new int[] {1, 2, 3});
        m.fly(1, 1, 2, 3);
    }

    // overloading and varargs
    public void fly(int[] length){}

    public void fly(int a, int... length){}

}
