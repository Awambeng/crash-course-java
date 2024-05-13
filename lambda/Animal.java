package lambda;

public class Animal {
    private String specie;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer){
        specie = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean isCanHop(){
        return canHop;
    }

    public boolean isCanSwim(){
        return canSwim;
    }

    public String toString(){
        return specie;
    }
}
