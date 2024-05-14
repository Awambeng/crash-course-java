package chapterfive.javainterfaces;

public interface Animals {
    public static final int COUNT = 5; // when declaring a variable in an interface it only supports public and default access modifiers and can have the static and final keyword. It must also be initialized when declared. 
    // An interface is not required to have methods
    // An interface cannot be instantiated directly
    // An interface cannot be marked as final
    // Top level interfaces are assumed to have the modifier abstract and public in their definition
    // All nondefault methods in an interface are assumed to have the modifiers abstract and public in their definition.

    // protected void eat(); // does not compile because of the access modifier
    // public final void greet(); // does not compile because of the final keyword.

    public abstract void greet();
    public default void eat(){
        System.out.println("eating");
    }

    // we can have static methods in an interface. If you define a method in an interface using the static keyword it must have a body where it was defined or created.
    public static int count(){
        return 5;
    }
}
