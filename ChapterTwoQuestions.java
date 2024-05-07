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

        // question 14 (A, B, D)
        int[][] scores = new int[5][];
        Object[][][] cubbies = new Object[3][0][5];
        //String beans[] = new beans[6]; // wrong beans is not a type
        java.util.Date[] dates[] = new java.util.Date[2][];
        //int[][] types = new int[]; // wrong 
        //int[][] java = new int[][]; // wrong

        // question 14

    }
}

class Lion {
    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!"); // note that String is immutable so the concatenation doesn't work.
        roar2.append("!!!");
    }
}
