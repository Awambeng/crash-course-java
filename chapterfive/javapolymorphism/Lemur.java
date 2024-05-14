package chapterfive.javapolymorphism;

import chapterfive.javainterfaces.HasTail;

public class Lemur extends Primate implements HasTail {

    public int age = 10;

    public boolean isTailStriped(){
        return false;
    }

    public static void main(String[] args) {
        Lemur l = new Lemur();
        System.out.println(l.age);

        HasTail h = l;
        System.out.println(h.isTailStriped());

        Primate p = l;
        System.out.println(p.hasHair());

        Lemur l1 = (Lemur)p;
        System.out.println(l1.age);

    }
}
