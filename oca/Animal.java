package oca;

// this is a class. // this is a single line comment
public class Animal {
    // this is a field
    String name;

    // this is a method
    public String getName(){
        return name;
    }

    // this is another method
    public void setName(String newName){
        name = newName;
    }

    /* this is a multiple line comment 
     constructor
    */
    public Animal(String name){
        this.name = name;
    }

    /**
     this is a javadoc comment
     @author Awambeng Rodrick
     */

     public static void main(String[] args){
        Animal a1 = new Animal("Dog");
        System.out.println(a1.getName());
        Animal2 a2 = new Animal2();
        System.out.println(a2.greeting());
     }
}

class Animal2{
    public String greeting(){
        return "Hello world";
    }
}