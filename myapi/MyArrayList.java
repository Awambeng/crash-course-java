package myapi;

import java.util.*;

public class MyArrayList {
    public static void main(String[] args){
        // converting from an ArrayList to an array.
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);

        // converting from an array to ArrayList.
        String[] array = {"haw", "robin"};
        List<String> list1 = Arrays.asList(array);
        System.out.println(list1.size());
        list1.set(1, "test");
        array[0] = "new";
        for (String b : array){
            System.out.println(b);
        }
        // list1.remove(1);

        // sorting and ArrayList: it uses a helper class Collections
        List<Integer> numbers = new ArrayList();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers); 
        System.out.println(numbers);
    }
}
