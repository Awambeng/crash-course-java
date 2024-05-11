package chapterfour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceJava {
    public static void main(String[] args){
        // reference to a static method 
        Function<String, Integer> funct = Integer::parseInt;
        Integer result = funct.apply("42");
        System.out.println(result);
        result += 2;
        System.out.println(result);

        // reference to an instance method of an object
        List<String> names = Arrays.asList("Bob", "Alice", "Toto", "Titi");
        names.forEach(System.out::println);

        // reference to an instance method of an arbitrary object of a particular type
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Hello").add("World");
        String res = joiner.toString();
        System.out.println(res);

        // Example: Reference to a constructor
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();
        list.forEach(System.out::println);
    }
}
