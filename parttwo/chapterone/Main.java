package parttwo.chapterone;

public class Main{
    // Adding final to instance and static variables
    final int age = 10;
    final int fishEaten;
    final String name;
    //static final int giraffe; // does not compile

    // instance initializer block
    { fishEaten = 10; } // initializing the fishEaten instance member in an instance initializer

    // declaring a constructor
    public Main(){
        name = "John"; // initializing the name in the constructor
    }

    private void printZooInfo(boolean isWeekend){
        // declaring final local variables
        final int giraffe = 5;
        final long lemur;
        if(isWeekend) lemur = 5;
        else lemur = 10;
        System.out.println(giraffe + " " + lemur);
    }

    public void info(){
        System.out.println("name: " + name + " ," + "age: " + age + " ," + "fishEaten: " + fishEaten );
    }

    /** Rule 1: final variables must be initialized before the first use of of the variable.
     * The first rule to note here is that when declaring a variable as final it is not required to initialize it on thesame line 
     * it was declared but the rule is that a final variable should be initialized before the first use of the variable.
     * @param args
     */

     // example 2
     private void printZooInfo2(boolean isweekend){
        final int giraffe = 5;
        final long lemur;
        if(isweekend) lemur = 5;
        //giraffe = 3; // does not compile because giraffe is final
        //System.out.println(giraffe + " " + lemur); // does not compile because lemur is not initialize
     }

    public static void main(String[] args) {        
        new Main().printZooInfo(true);
        new Main().printZooInfo2(true);
        var main = new Main();
        main.info();
        var season = Season.SUMMER;
        switch(season){
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("Time to pool");
                break;
            case WINTER:
                System.out.println("Get out the sled");
                break;
            default:
                System.out.println("Is it summer yet?");
        }
    }
}

abstract class Animal{
     // writing final methods
     /*
      * Note: methods marked with the final keyword cannot be overriden by a subclass.
      * An abstract method is a method that has no implementation and must be overridden by a subclass. They are usually
      * declared with the abstract keyword in an abstract class.
      */
      abstract void chew();
}

class Hippo extends Animal{
    final void chew(){}
}

class PygmyHippo extends Hippo{
    //void chew(){} // does not compile because chew() is final and we cannot override it.
}