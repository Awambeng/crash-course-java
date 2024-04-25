import java.time.LocalDate;
import java.time.Month;

class Simple{

   abstract class Student extends ClassLoader implements Hello, Hello1{
    public String test(){return null;}
}
    public static void main(String [] args){
        // System.out.println("Hello World");
        // Class sim = Simple.class;
        // Class std = Student.class;
        // Class test = Object.class;
        // Class cl = Class.class;

        // System.out.println(sim.getClassLoader());
        // System.out.println(std.getClassLoader());
        // System.out.println(test.getClassLoader());
        // System.out.println(cl.getClassLoader());

        Person p1 = new Person("Hush");
        Person p2 = new Person("Poppy");
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}

interface Hello{
    public  default String test(){return null;}
}

interface Hello1{
    public default String test(){return null;}
}
