package chapterfive;

public class Shark extends Fish{
    private int numberOfFins = 8;

    public Shark(int age){
        super(age);
        this.size = 4;
    }

    public void displayDetails(){
        System.out.println("Shark with age: " + getAge());
        System.out.println(" and " + size + " meters long");
        System.out.println(" with " + numberOfFins + " fins");
    }

    // using this to access members of a class
    public void displayDetailsWithThisKeyWord(){
        System.out.println("Shark with age: " + getAge());
        System.out.println(" and " + this.size + " meters long"); // using this to access parent class field
        System.out.println(" with " + this.numberOfFins + " fins"); // using this to access field in the child class
    }

    // using super to access members of the parent class
    public void displayDetailsWithSuperKeyWord(){
        System.out.println("Shark with age: " + getAge());
        System.out.println(" and " + super.size + " meters long"); // using super to access parent class field
        // System.out.println(" with " + super.numberOfFins + " fins"); // using super to access field in the child class. It does not compile because the field was declared in the child class (which is the current class).
    }

    public static void main(String[] args) {
        Shark s = new Shark(10);
        s.displayDetails();
        System.out.println("Printing details using this keyword...");
        s.displayDetailsWithThisKeyWord();
        System.out.println("Printing details using super keyword...");
        s.displayDetailsWithSuperKeyWord();
    }
}
