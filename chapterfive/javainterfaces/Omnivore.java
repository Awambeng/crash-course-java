package chapterfive.javainterfaces;

public interface Omnivore {
    public void eatPlants();
    public void eatMeat();
    public void eat();
    public default int getNumber(){
        return 4;
    }
}
