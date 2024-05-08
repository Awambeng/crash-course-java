package chapterfour;

import java.util.ArrayList;

public class Initializers {
    private static final int NUM_BUCKETS = 45;
    public static void main(String[] args){
        //NUM_BUCKETS = 5; // DOES NOT COMPILE BECAUSE FIELD WAS DECLARED AS A CONSTANT USING FINAL KEYWORD.
        values.add("changed");
        values.add("hello");
        values.set(1, "test");
        for (String val : values){
            System.out.println(val);
        }
    }

    private static final ArrayList<String> values = new ArrayList<>(); // we are allowed to called methods on referenced variables so the final keyword doesn't restrict us from adding values to the arraylist.
}
