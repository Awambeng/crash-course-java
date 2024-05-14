package chapterfive.overridingmethods;

public class Eagle extends Bird {

    public int fly(int height){
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

   // public int eat(int food){ // does not compile because the return type in the parent class of the method is void but here we are using int which is not a subclass of the return type of the method in Bird.
    //    System.out.println("Bird is eating " + food + " units of food...");
     //   return food;
   // }
}
