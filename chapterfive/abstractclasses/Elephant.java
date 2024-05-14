package chapterfive.abstractclasses;

public class Elephant extends Anim {

    // method was already implemented by the child abstract class Anim so no need implementing it again
    // @Override
    // public String getName(){
    //     return "Elephant";
    // }

    @Override
    public void roar(){
        System.out.println("roar");
    }

    public void greet(){
        System.out.println("greet");
    }
    public static void main(String[] args) {
        Elephant e = new Elephant();
        e.roar();
        String res = e.getName();
        System.out.println(res);
    }
}
