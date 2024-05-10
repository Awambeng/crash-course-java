package chapterfour;

public class TooManyConversions {
    public static void play(Long l){}

    public static void play(Long ... l){}

    public static void main(String[] args) {
        //play(1); // does not compile because java can only convert from a type to another
        // in our case the method play takes a parameter of type Long which is an object
        // so in this case we are parsing an int so two conversions need to be done before arriving at the 
        // final type Long which are 
        // from int to long (primitive types) then from long to Long. But this can't work since 
        // we java can only do a single conversion.
        play(1L, 2L);
        play(1L, 2L, 3L);
    }
}
