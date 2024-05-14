package chapterfive.overridingmethods;

public class Camel {
    protected String getNumberOfHumps(){
        return "Undefined";
    }

    protected boolean isHasLegs() throws InsufficientDataException{
        throw new InsufficientDataException();
    }

    protected double getWeight() throws Exception{
        return 2;
    }

    protected double getHeight() throws InsufficientDataException {
        return 2;
    }
    protected int getLength() {
        return 10;
    }
}
