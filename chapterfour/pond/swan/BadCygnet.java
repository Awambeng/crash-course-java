package chapterfour.pond.swan;

import chapterfour.pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        //duck.quack(); // does not compile because the access modifier used on the quack() method is default which means this method can only be accessible within the declaration class 
        // of the method or within classes in thesame package.
        //System.out.println(duck.noise); // same applies for the instance variable.
    }
}
