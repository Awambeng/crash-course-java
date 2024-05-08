package chapterfour;

public class Koala {
    public static int count = 1;
    private String name = " toto";

    public void eat(){
        String newName = count + name;
        System.out.println(newName);
    }
    public static void main(String[] args) {
        // System.out.println(count);
        Koala k = new Koala();
        System.out.println(k.count);
        k = null;
        System.out.println(k.count);
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(koala1.count); // note all instances of a class share thesame static variable so output is the last value that was set which is 5
        System.out.println(Koala.count); // prints 5
        System.out.println(koala1.count); // prints 5
        new Koala().eat();
    }
}