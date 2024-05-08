package chapterfour.pond.inland;

import chapterfour.pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird(){
        Bird b = new Bird();
        //b.floatInWater(); // does not compile because we are calling a protected method from a class in another package which is not a subclass. 
        //System.out.println(b.text); // same thing applies for the instance variable.
    }
}
