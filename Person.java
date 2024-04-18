public class Person {
    private String name; // instance variable
    private static int age = 10; // static variable

    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void greeting(){
        String message = "Good morning"; // local variable
        System.out.print(message);
    }

    public String toString(){
        greeting();
        return (" { name: " + name + ", " + "age: " + age + " }");
    }

}
