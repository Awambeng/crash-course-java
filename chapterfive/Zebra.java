package chapterfive;

public class Zebra extends Animal {
    public Zebra(int age){ // parameterized constructor.
        super(age);
    }

    public Zebra(){ // default or non argument constructor
        this(4);
    }
}
