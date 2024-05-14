package chapterfive.javainterfaces;

public interface Herbivore {
    public void eatPlants();
    public void eat(int quantity);

    public default int getNumber(){
        return 8;
    }
}
