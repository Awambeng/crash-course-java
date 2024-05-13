package lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Rabbit", true, false));
        animals.add(new Animal("Turtle", false, true));

        print(animals, new CheckIfHopper()); // pass the class that does the check
    }

    private static void print(List<Animal> animals, CheckTrait checker){
        for(Animal animal : animals){
            if(checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }
}
