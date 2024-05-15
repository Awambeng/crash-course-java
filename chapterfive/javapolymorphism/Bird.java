package chapterfive.javapolymorphism;

public class Bird {

    public String getName(){
        return "Unknown";
    }

    public void displayInformation(){
        System.out.println("The bird name is: " + this.getName());
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.displayInformation();
    }
}
