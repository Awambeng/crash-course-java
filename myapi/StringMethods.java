package myapi;

public class StringMethods {
    public static void main(String[] args){
        String animal = "Lion";
        System.out.println(animal.length());
        System.out.println(animal.charAt(0));
        System.out.println(animal.charAt(1));
        System.out.println(animal.charAt(2));
        System.out.println(animal.charAt(3));

        // the indexOf method is used to get the position 
        // of a character in a string
        System.out.println(animal.indexOf('L'));
        System.out.println(animal.indexOf('i'));
        System.out.println(animal.indexOf('o'));
        System.out.println(animal.indexOf('n'));
        System.out.println(animal.indexOf("Li"));
        System.out.println(animal.indexOf("i", 0));
        System.out.println(animal.indexOf("on", 1));

        // substring() method is used return part of a string.
        /*
         * the signature is as follows:
         * int substring(int startIndex)
         * int substring(int startIndex, int endIndex)
         */

         String name = "Animals";
         System.out.println(name.substring(3));
         System.out.println(name.substring(0, 4));
         System.out.println(animal.substring(0, 4));
         System.out.println(name.toUpperCase());
         System.out.println(name.toLowerCase());

         // equals() method and equalsIgnoreCase() method
         String student1 = "Toto";
         String student2 = "toto";
         System.out.println(student1.equals(student2)); // false
         System.out.println(student1.toLowerCase().equals(student2.toLowerCase())); // true
         System.out.println(student1.equalsIgnoreCase(student2)); // true

         // startWith() method and endWith() method
         System.out.println("abc".startsWith("a")); // true
         System.out.println("abc".endsWith("b")); // false
         System.out.println("abc".startsWith("a", 0)); // false

         // replace() method is used to replace a given character in a string with another.
         System.out.println(name.replace('A', 'M'));
         System.out.println(name.replace("n", "a"));
         System.out.println(name.replaceFirst("i", "m"));
         System.out.println(name.replaceAll("m", "I"));

         // the trim() method is just used to remove space within a string 
         String test = " hello world \t";
         System.out.println(test);
         System.out.println(test.trim().toUpperCase().replace("H", "h"));

         String d = "abc";
         String e = d.toUpperCase();
         e = e.replace("B", "2").replace("C", "3");
         System.out.println("d= " + d);
         System.out.println("e= " + e);
    }
}
