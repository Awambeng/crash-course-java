package chapterfour;

public class PassDataAmongMethod {
    public static void main(String[] args) {
        int num = 4;
        newNum(5);
        System.out.println(num);

        String name = "Webby";
        speak(name);
        System.out.println(name);

        StringBuilder name1 = new StringBuilder();
        // StringBuilder n = name1;
        // name1.append("test");
        // name1.append("test2");
        // n.append("ntest");
        // System.out.println(name1.toString());
        // System.out.println(n.toString());
        System.out.println(name1.capacity());

        // speak1(name1);
        // System.out.println(name1);
    }

    public static void newNum(int num){
        num = 8;
    }

    public static void speak(String name) {
        name = "Sparky";
    }

    public static void speak1(StringBuilder s) {
        s.append("Webby");
    }
}
