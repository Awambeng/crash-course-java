package myapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class ChapterTwoQuestions {
    public static void main(String[] args){
        // question 1
        int numFish = 4;
        String fishType = "tuna";
        //String anotherFish = numFish + 1; // the code does not compile because of this line. we are adding two numbers then storing in a String which cannot work
        // System.out.println(anotherFish + " " + fishType);
        System.out.println(numFish + " " + 1);

        // question 2
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one"); // true
        if (t == s) System.out.println("two"); // false
        if (t.equals(s)) System.out.println("three"); // true
        if ("Hello" == s) System.out.println("four"); // true
        if ("Hello" == t) System.out.println("five"); // false

        // note == is used to check if two onjects are equal (reference types point to thesame object) where as 
        // equals() checks if two referenced types have thesame content.

        // question 3
        /*
         * B. An immutable object cannot be modified.
         * C. An immutable object can be garbage collected.
         * E. String is immutable.
         */

        // question 4 (B)
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

        // question 5 
        String s1 = "java";
        StringBuilder s2 = new StringBuilder("java");
        //if (s1 == s2) // the code does not compile incompatible types. (F)
        // System.out.print("1");
        if (s1.equals(s2))
        System.out.print("2");

        // question 6 (B)
        String roar1 = "roar";
        StringBuilder roar2 = new StringBuilder("roar");
        new Lion().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2);

        // question 7
        String letters = "abcdef";
        System.out.println(letters.length()); // prints 6
        System.out.println(letters.charAt(3)); // prints d
        //System.out.println(letters.charAt(6)); // throws an exception because there is no element at index 6 (StringIndexOutOfBoundsException)

        // question 8 (A, D, E)
        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3)); // prints 12
        System.out.println(numbers.substring(7, 7)); // prints A blank line
        System.out.println(numbers.substring(7)); // prints characters from index number 7 of the string till the end of the string so we have 78

        // question 9 (C)
        String s3 = "purr";
        s3.toUpperCase();
        s3.trim();
        s3.substring(1, 3);
        s3 += " two";
        System.out.println(s3.length());

        // question 10 (F)
        String a = "";
        a += 2;
        a += 'c';
        a += false; // note a String is immutable so each time you concatenate you are simply creating a new object then reassigning it and == checks if two reference
        // types points to thesame object in the memory which is false.
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals");

        // question 11 (E)
        int total = 0;
        StringBuilder letter = new StringBuilder("abcdefg");
        total += letter.substring(1, 2).length();
        total += letter.substring(6, 6).length();
        //total += letter.substring(6, 5).length(); // prints exception index out of bounds
        System.out.println(total);

        // question 12 (A)
        StringBuilder number = new StringBuilder("0123456789");
        number.delete(2, 8);
        number.append("-").insert(2, "+");
        System.out.println(number);

        // question 13 (F)
        // StringBuilder b = "rumble";
        // b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        // System.out.println(b);

        // question 15 (A, B, D)
        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
        //String beans[] = new beans[6]; // wrong beans is not a type
        java.util.Date[] dates[] = new java.util.Date[2][];
        //int[][] types = new int[]; // wrong 
        //int[][] java = new int[][]; // wrong

        // question 14 (A)
        StringBuilder puzzle = new StringBuilder("Java");
        puzzle.reverse();
        // puzzle.append("vaJ").substring(0, 2);
        //puzzle.append("vaJ").delete(0, 3).deleteCharAt(puzzle.length() - 1);
        System.out.println(puzzle);

        // question 16 (C)
        char[] c = new char[2];
        int length = c.length;
        System.out.println(length); // Arrays uses the length to determine the length of the array not length()

        // question 17 (D)
        ArrayList l = new ArrayList(1);
        l.add(1);
        l.add(2);
        System.out.println(l.size()); // ArrayList uses size() method and not length()
    
        // question 18 (A, C, D, E)

        // question 19 (B)
        int[] ar = new int[2];
        int[] ab = {1,2,3};
        ArrayList nn = new ArrayList();
        nn.add(1);
        nn.add(2);

        ArrayList n = new ArrayList();
        n.add(1);
        n.add(2);
        //n.remove(0); applying the remove on an arraylist that is null or has no element throws an exception index out of bound

        if (n == nn) System.out.println("yes");
        if (n.equals(nn)) System.out.println("the content of the two arraylist are equal");

        // question 20 (D)
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7); // compilatio error because of imcopatible type
        for(String ss1 : list) System.out.println(ss1);

        // question 21 (C)
        ArrayList<Integer> val = new ArrayList<>();
        val.add(4);
        val.add(5);
        val.set(1, 6);
        val.remove(0);
        for (Integer v : val) System.out.println(v);

        // question 22 (A)
        int[] random = {6, -4, 12, 0, -10};
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);

        // question 23 (A)
        List<Integer> lists = Arrays.asList(10, 4, -1, 5);
        Collections.sort(lists);
        Integer array[] = lists.toArray(new Integer[4]);
        System.out.println(array[0]);

        // question 24 (C)
        String [] nam = {"Tom", "Dick", "Harry"};
        //List<String> lis = nam.asList(); // cannot asList() on the array
        //lis.set(0, "Sue");
        System.out.println(nam[0]);

        // question 25 (D)
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);
        for (String ll : hex) System.out.println(ll);
        int x1 = Collections.binarySearch(hex, "8");
        int y1 = Collections.binarySearch(hex, "3A");
        int z1 = Collections.binarySearch(hex, "4F");
        System.out.println(x1 + " " + y1 + " " + z1);

        // question 27
        List<String> one = new ArrayList<String>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");
        if (one == two)
        System.out.println("A");
        else if (one.equals(two))
        System.out.println("B");
        else
        System.out.println("C");

        // question 26 (B)
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        // ages.add(null); // throws runtime exception because value is null
        for (int age : ages) System.out.println(age);

        // question 28 (D, F)
        LocalDate date2 = LocalDate.of(2014, Month.JUNE, 21); // correct
        LocalDate date3 = LocalDate.of(2014, 5, 21); // prints May instead of June so its wrong
        LocalDate date4 = LocalDate.of(2014, 6, 21); // correct
        LocalDate date5 = LocalDate.of(2014, Calendar.JUNE, 21); // when using Calendar it starts counting the months from 0 so JUNE will be MAY (Month number 5)
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(date5);

        // QUESTION 29 (D)
        LocalDate da = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        da.plusDays(2); // no change since Date is immutable
        //da.plusHours(3);  // In the LocalDate class there is only Date and no time so we can't use the method plusHours().
        System.out.println(da.getYear() + " " + da.getMonth() + " "
        + da.getDayOfMonth());

        // question 30 (F)
        // LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
        // System.out.println(date.getYear() + " " + date.getMonth() + " "
        // + date.getDayOfMonth());

        // question 31 (B)
        LocalDate date7 = LocalDate.of(2018, Month.APRIL, 30);
        date7.plusDays(2); // date is immutable so it doesn't affect the date7 result
        date7.plusYears(3); // date is immutable to make it work you need to reassign the variable
        System.out.println(date7.getYear() + " " + date7.getMonth() + " "
        + date7.getDayOfMonth());

        // question 32 (E)
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(d.format(f));

        // question 33 (B)
        LocalDateTime t1 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p1 = Period.ofDays(1).ofYears(2);  // WHEN YOU CHAIN METHODS USING PERIOD IT MAKES USE ONLY OF THE LAST METHOD OF THE CHAIN AND IGNORE THE REST
        // SO IN OUR CASE IT WILL EXECUTE ONLY THE METHOD ofYears(2) and ignore ofDays(1).
        t1 = t1.minus(p1);
        DateTimeFormatter f1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle
        .SHORT);
        System.out.println(f1.format(t1));
    }
}

class Lion {
    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!"); // note that String is immutable so the concatenation doesn't work.
        roar2.append("!!!");
    }
}
