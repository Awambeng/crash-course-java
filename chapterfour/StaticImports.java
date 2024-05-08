package chapterfour;

import java.util.List;
import static java.util.Arrays.asList;
import static chapterfour.StaticInitializer.eating;
import static chapterfour.StaticInitializer.s;

public class StaticImports {

    public static void main(String[] args) {
        List<String> list = asList("one", "two");
        System.out.println(list.toString());
        String s1 = eating();
        System.out.println(s);
    } 
}
