# Methods and Encapsulation

## Access Modifiers
In java we have four types of access modifiers namely: public, private, protected and default.

- public access modifiers: The method can be called from any class.
- private access modifiers: The method can only be called within thesame class.
- protected access modifiers: The method can only be called by classes in thesame package or subclasses.
- Default access modifiers: The methods can only be called from classes in thesame package.


| Access Modifier   | Same Class | Same Package | Subclasses | Different Package |
|-------------------|------------|--------------|------------|------------------|
| Public            | Yes        | Yes          | Yes        | Yes              |
| Protected         | Yes        | Yes          | Yes        | No               |
| Default (Package) | Yes        | Yes          | No         | No               |
| Private           | Yes        | No           | No         | No               |

## Optional specifiers when dealing with methods
- static: used for a class method.
- abstract: used for a method that doesn't have a body.
- final: used when a method is not allowed to be overriden by a subclass. 
- native: Used when interacting with code written in another language such as C++.
- strictfp: Used for making floating-point calculations portable.

### Note: These specifiers can come before the access modifiers. 

- A method that has a return type void can have the return statement inside the body of that method but it should return nothing. example:
```java
public void test(){
    System.out.println("hello, world");
    return;
}
```

- When declaring a method you can indicate that something went wrong by throwing an exception. The lines below will show you how you can add exception to your methods so that when something goes wrong it throws that exception. 

```java
public void add() throws Exception, IllegalArgumentException, InterruptedException{
    // write some codes here...
}
```

- Note that we can pass several exceptions like in the example above by separating each with a comma. 

## Calling a static method
- To call a static method or static instance variable in java you don't need to instantiate the class. Example:
Consider the class Animal below:
```java
public class Animal{
    private static String name = "Lion";

    public static void sound(){
        System.out.println(name + " roars");
    }

    public static void main(String [] args){
        // calling the members of Animal
        System.out.println(Animal.name);
        Animal.sound();
    }
}
```

- To declare a variable as a constant in java you can use the keyword final and following convention the variable name needs to be all in uppercase. Example:

```java
private static final int COUNT = 0; // declaration and initialization of the variable.
private static final String STUDENT_CLASS = "level 400"; // declaration and initialization of the variable.
```

