package myapi;

public class Mutable {
    private String s;

    // setters makes s to be mutable since we
    // will be able to change its value
    public void setS(String newS){
        this.s = newS;
    }

    // getters for s
    public String getS(){
        return s;
    }
}

// All immutable classes have the final keyword in java and subclasses 
// can't add mutable behavior.
class Immutable{
    private String s = "name";

    /**
     * immutability only has getters 
     * @return
     */
    public String getS(){
        return s;
    }
}
