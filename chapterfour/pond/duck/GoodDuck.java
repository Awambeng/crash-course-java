package chapterfour.pond.duck;

public class GoodDuck {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
