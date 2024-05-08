package chapterfour;

public class Gorilla {
    public static int count;
    public static void addGorilla(){
        count++;
    }
    public void babyGorilla(){
        count++;
    }

    public void announceBabies(){
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone(){
        addGorilla();
        //babyGorilla(); // does not compile because a static member cannot call an instance member directly it can only be done by 
        //instantiating that class and using the object then call the instance method using the created object.
        // the line below works perfectly
        
        //new Gorilla().babyGorilla();
    }

    public int total;
    //public static int average = total / count; // does not compile because static variable is trying to use an instance variable.
}
