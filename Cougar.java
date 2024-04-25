interface HasTail{
    int getTailLength();
}

abstract class Puma implements HasTail{
    protected int getTailLength(){ // cannot reduce visibility of inherited methods
        return 4;
    }
}
public class Cougar extends Puma{
    public static void main(String[] args){
        //Puma puma = new Puma(); // cannot instantiate an abstract class
        //System.out.println(puma.getTailLength());
    }
}
