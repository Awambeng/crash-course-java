package chapterfive.javainterfaces;

public interface SharkFamily extends HasFins{
    public default int getNumberOfFins() {
        return 8;
    }

    public double getLongestFinLength();

    //public boolean doFinsHaveScales(){ // does not compile because the method is having a body and is not having a default keyword.  
       // return false;
    //}

    // Note interfaces can only take a method with a body if it is declared with the default keyword. 
    // If the method don't have the default keyword then t shouldn't have a body.
}
