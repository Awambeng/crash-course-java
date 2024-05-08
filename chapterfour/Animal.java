package chapterfour;

public class Animal{
    private static String name = "Lion";

    public static void sound(){
        System.out.println(name + " roars");
    }

    public static void main(String [] args){
        // calling the members of Animal
        System.out.println(Animal.name);
        Animal.sound();
    }
}
