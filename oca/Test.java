package oca;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Animal.main(args);
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}