package myapi;

public class StringClass {
    public static void main(String[] args){
        String num1 = "1";
        String num2 = "2";
        int a = 4;
        String b = "b";
        String num3 = num1.concat(num2) + a;
        System.out.println(num3);
        System.out.println(1 + 2 + a + b);
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }
}
