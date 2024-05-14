package chapterfive.abstractclasses;

public class Lion extends Elephant {

    @Override
    public String getName(){
        return "Lion";
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        String res = l.getName();
        System.out.println(res);
    }
}
