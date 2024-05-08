package chapterfour;

public class StaticInitializer {
    public static String s = "null";
    static{System.out.println("hello everyone, this is a static initializer");} // static initializer

    {System.out.println("hello, this is an instance initializer");} // instance initializer

    public static void main(String[] args) {
        System.out.println("hey");
        StaticInitializer s = new StaticInitializer();
    }

    public String eat(){
        System.out.println("method example");
        return "";
    }

    public static String eating(){
        System.out.println("static method example");
        return "";
    }

    // note: the static initializer runs when the class is used while the instance initializer is used when a new instance is created.
}


