package chapterfive;

public class Lion extends Animal {
    private void roar(){
        System.out.println("The " + getAge() + " year old lion says: Roar!");
    }

    public Lion(int age){
        super(age); // calling constructor of parent class Animal and since it takes one parameter we need to add that parameter while calling the constructor.
    }
}
