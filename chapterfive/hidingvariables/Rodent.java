package chapterfive.hidingvariables;

public class Rodent {
    protected int tailLength = 4;

    public void getRodentDetails(){
        System.out.println("[parentTail = " + tailLength + "]");
    }
}
