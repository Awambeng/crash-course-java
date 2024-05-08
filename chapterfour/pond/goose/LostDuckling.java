package chapterfour.pond.goose;

import chapterfour.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim(){
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim();
        System.out.println("Thanks " + teacher.name);
    }

    public static void main(String[] args) {
        LostDuckling l = new LostDuckling();
        l.swim();
    }
}
