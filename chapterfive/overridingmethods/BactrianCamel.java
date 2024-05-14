package chapterfive.overridingmethods;

public class BactrianCamel extends Camel {
    //private int getNumberOfHumps(){ // cannot override method because of the access modifier and the return type.
       // return 2;
    //}

    @Override
    protected boolean isHasLegs(){
        return false;
    }

    @Override
    protected double getWeight() throws InsufficientDataException{
        return 2;
    }

   // protected double getHeight() throws Exception { // DOES NOT COMPILE
      //  return 2;
    //}
    
    // protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
    // return 10;
    // }
}
