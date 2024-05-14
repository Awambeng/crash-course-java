package chapterfive.abstractclasses;

import chapterfive.javainterfaces.*;

public abstract class Anim extends Animal implements Animals{
    
    public abstract void roar();

    public String getName(){
        return "Elephant";
    }
}
