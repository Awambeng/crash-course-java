package chapterfive;

public class Animal {
    private int age;
    public int getAge(){ return age; } // get age
    public void setAge(int newAge){ this.age = newAge; } // set age
    public Animal(int age){
        super(); // calling constructor of parent class Object
        this.age = age;
    }
}
