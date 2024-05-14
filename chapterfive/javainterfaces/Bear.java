package chapterfive.javainterfaces;

public class Bear implements Herbivore, Omnivore {
    public void eatPlants(){
        System.out.println("Hello i am eating plants");
    }

    public void eatMeat(){
        System.out.println("Hello i am eating meat");
    }

    public void eat(){
        System.out.println("eat (method overloading)");
    }

    public void eat(int qty){
        System.out.println("I have eaten " + qty + " bags of rice...");
    }

    // since we have two getNumber() default methods (one in the Herbivore interface and one in the Omnivore interface) for our code to be able to compile we need to 
    // override this getNumber() default method as seen below.
    public int getNumber(){
        return 20;
    }

    public static void main(String[] args) {
        Bear b = new Bear();
        int res = b.getNumber();
        System.out.println(res);
    }
}
