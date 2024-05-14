package chapterfive.javainterfaces;

public class Dog implements Lion{
    public void greet(){
        System.out.println("I am greeting an implementation of the greet method from parent interface");
    }

    public void getName(){
        System.out.println("Hello i am the child interface");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.greet();
        d.getName();
    }
}
