package myapi;

import java.util.*;

public class Myarray {
    public static void main(String ... args){
        char[] mychar = new char[5];
        mychar[0] = 'a';
        mychar[1] = 'b';
        mychar[2] = 'c';

        for(char c : mychar){
            System.out.print(c + "\t");
        }
        System.out.println();

        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;

        int[] nums = new int[10];
        for(int i=0; i<nums.length; i++){
            nums[i] = i + 2;
            System.out.print(nums[i] + "\t");
        }
        System.out.println();

        int[] numbers = {2, 1, 3}; // this is an anonymous array
        // anonymous arrays are arrays declared without the type and size.
        Arrays.sort(numbers);
        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + "\t");
        }

        // when using sort() method in an array of strings it sort numbers before letters
        // and sort uppercase before lowercase.
        String[] names = {"Toto1", "tiTi2", "JuNior2", "Hush", "123", "ABC", "abc"};
        Arrays.sort(names);
        for(String name : names){
            System.out.print(name + " ");
        }
        System.out.println();

        // searching in arrays. to search an element in an array we can use
        // binarysearch and for that to work the array must be sorted meaning if it is an
        // array of integers the elements in it must be in ascending order. example:
        int[] myNumbers = {5, 3, 2, 4, 1};
        // to perform a search on this array we first need to sort the array since it is not sorted.
        Arrays.sort(myNumbers);
        // we have sorted the array, now we can search.
        System.out.print(Arrays.binarySearch(myNumbers, 2) + " ");
        System.out.print(Arrays.binarySearch(myNumbers, 3) + " ");
        System.out.print(Arrays.binarySearch(myNumbers, 4) + " ");
        System.out.print(Arrays.binarySearch(myNumbers, 5) + " ");
        // varargs is called variable argument. example of usage
        // public static void main(String... args) // varargs
        System.out.println(args.length);

        int[][] m = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int[] m1 : m){
            for (int m2 : m1){
                System.out.print(m2 + " ");
            }
        }

        // ArrayList can change size at runtime.
        // how to create a ArrayList. there exist three ways.
        /**
         * old way of doing but it still works
         */
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);
        ArrayList list1 = list2;

        /**
         * new way is by adding the datatype of array. example:
         */

        ArrayList<String> list4 = new ArrayList<String>();
        ArrayList<String> list5 = new ArrayList<>(); // from java 7 you can omit the type on the right hand side.
        list2.add("titi");
        list2.add(1, "hush");
        list2.add(0, "toto");
        list2.add(2);
        list2.add(1, Boolean.TRUE);
        System.out.print(list2);
        System.out.print(list1.toString());

        // remove() method is used to remove an element at a given index.
        System.out.println(list2.remove("toto")); // prints true if it finds toto in list2
        System.out.println(list2.remove(3));
        System.out.println(list2);
        System.out.println(list1);
        System.out.println(list2.size());

        // the set() method is used to change the elements of an ArrayList without changing the size.
        System.out.println(list2.set(2, "Hush Poppy"));
        System.out.println(list2);
        System.out.println(list3.isEmpty()); // checks if the ArrayList is empty

        // the contains() method is used to check if a certain value is in the ArrayList.
        // it calls the equals() method to see whether there are any matches.
        System.out.println(list2.contains("Hush Poppy"));

        // the clear() method discards everything in an ArrayList.
        list2.clear();
        System.out.println(list2 + " " + list2.size());
        System.out.println(list1 + " " + list1.size());

        // the ArrayList implements the equals() method so you can use it to check if two lists.
        System.out.println(list2.equals(list1));

        // to convert from a String to a primitive yu can use
        // the parseInt(), parseBoolean() etc method depending on the type while
        // to convert from primitive to Wrapper classes you can use the 
        // valueOf() method.
    }
}
