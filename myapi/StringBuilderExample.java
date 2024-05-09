package myapi;

public class StringBuilderExample {
    public static void main(String[] args) throws Exception {
        // do something here
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);

        StringBuilder sb = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
        sb.append(current);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("start");
        sb1.append("+middle");
        StringBuilder same = sb1.append("+end");
        System.out.println(same);

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        StringBuilder c = new StringBuilder(5);
        c.append("animals");
        System.out.println("capacity" + c.capacity());

        StringBuilder s = new StringBuilder("animals");
        String sub = s.substring(s.indexOf("a"), s.indexOf("al"));
        int len = s.length();
        char ch = s.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        System.out.println("StringBuilder mthods");
        System.out.println("insert()");
        // the insert() method adds characters to the StringBuilder at a requested index
        // and returns the StringBuilder
        // method signature StringBuilder insert(int offset, String str)
        StringBuilder newSb = new StringBuilder("anim");
        newSb.insert(4, "als");
        newSb.insert(7, "-");
        newSb.insert(8, "one");
        System.out.println(newSb);

        // delete() method and deleteCharAt() method
        // the delete method is the opposite of insert() method.
        // the deleteCharAt() method deletes a character at a given index.
        newSb.delete(8, 11);
        System.out.println(newSb);
        newSb.deleteCharAt(7);
        System.out.println(newSb);

        // the reverse() method is used to reverse a given string and return the reference of the StringBuilder
        // example:
        newSb.reverse(); // reversing animals to slamina
        System.out.println(newSb); 

        StringBuilder nsb = new StringBuilder("animals");
        String n = "anim";
        n = n + "als";
        n = nsb + "hey";
        System.out.println(n);
    }
}
