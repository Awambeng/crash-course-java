public class Chick{
    int numberOfEggs = 4;
    String name;
    private static Integer a;
    private static String b;

    public Chick(){
        this.name = "Eggs";
    }

    @Override
    public String toString(){
        return ("Name: " + name + " , " + "Number of eggs: " + numberOfEggs );
    }

    public static void main(String ... args){
        String text1 = "hey";
        String text2 = text1;
        text1 = text1 + text2;
        String message = "hello";
        int len = message.length();
        System.out.println(text1);
        Chick c = new Chick();
        c.numberOfEggs = 1_0;
        c.name = "ChickName";
        System.out.println(c.toString());
        // System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        // System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
        // System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println(a);
    }
}