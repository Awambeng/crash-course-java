package chapterfive.javapolymorphism;

public class Capybara extends Rodent{
    public static void main(String[] args) {
        Rodent r = new Rodent();
        if(r instanceof Capybara){
            Capybara c = (Capybara)r; // throws ClassCastException at runtime.
        }else{
            System.out.println("rodent is not an instance of Capybara");
            throw new ClassCastException();
        }
    }
}
