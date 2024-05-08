package chapterfour.pond.goose;

import chapterfour.pond.shore.Bird;

public class Gosling extends Bird { // extends means create subclass
    public void swim(){
        floatInWater(); // calling protected method from another package
        System.out.println(text); // calling protected instance variable from another package.
    }
    public static void main(String[] args) {
        Gosling g = new Gosling();
        g.swim();
    }
}
