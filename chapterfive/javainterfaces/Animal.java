package chapterfive.javainterfaces;

public interface Animal {
    // An interface is not required to have methods
    // An interface cannot be instantiated directly
    // An interface cannot be marked as final
    // Top level interfaces are assumed to have the modifier abstract and public in their definition
    // All nondefault methods in an interface are assumed to have the modifiers abstract and public in their definition.

    // protected void eat(); // does not compile because of the access modifier
    // public final void greet(); // does not compile because of the final keyword.

    public abstract void greet();
}
