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

## Static Initialization
- They are just like the instance initializers which are simple blocks of code that run when a new instance of a class is executed. The static initializers are similar just that static initializers add the static keyword to specify they should be run when the class is first used. For example:

```java
{System.out.println("hello")} // this is an instance initializer

// static initializer
private static final int NUM_SECONDS_PER_HOUR;
static{
    System.out.println("hello");
    int numSecondsPerMinute = 60;
    int numMinutesPerHour = 60;
    NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
}
```

- Static imports are used to import static members of a class that is (static methods and fields) while regular imports are used to import classes.

## Differences between pass-by-value and pass-by-reference.

- Here's how pass-by-value works in Java:

a. Primitive Types:

For variables of primitive types (such as int, char, boolean, etc.), the value itself is passed by value. Any modifications made to the parameter within the method do not affect the original variable outside the method. This is because the method works with a separate copy of the value.


b. Object References or referenced types:

For variables that hold object references (such as instances of classes), the reference itself is passed by value. The reference points to the same object in memory, but a copy of the reference is passed to the method.
This means that changes made to the object's state within the method are visible outside the method because both the original variable and the method parameter point to the same object. However, if the method reassigns the reference to a different object, it does not affect the original reference outside the method.

### Example:

```java
public class Example {
    public static void main(String[] args) {
        int x = 5;
        modifyPrimitive(x);
        System.out.println("After modifyPrimitive: " + x); // Output: 5

        StringBuilder sb = new StringBuilder("Hello");
        modifyReference(sb);
        System.out.println("After modifyReference: " + sb); // Output: Hello World
    }

    public static void modifyPrimitive(int value) {
        value = 10;
    }

    public static void modifyReference(StringBuilder builder) {
        builder.append(" World");
    }
}
```

In this example, the modifyPrimitive method receives a copy of the x variable, so any modifications made inside the method do not affect the original x variable. The modifyReference method receives a copy of the reference to the StringBuilder object, so changes made to the object's state are visible outside the method.

In Java, the language itself does not support pass-by-reference for variables or method arguments. Java strictly follows pass-by-value semantics. This means that when you pass a variable or object reference as an argument to a method, a copy of the value/reference is passed by value.

However, it's worth noting that there are some cases where pass-by-reference-like behavior can be achieved in Java by wrapping the variable or object reference in a mutable object, such as an array or a custom container class. By modifying the contents of the mutable object, changes can be seen outside the method. This technique is often referred to as "emulating pass-by-reference" in Java.

Here's an example to illustrate this concept:

```java
public class Example {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        modifyArray(arr);
        System.out.println("After modifyArray: " + Arrays.toString(arr)); // Output: [10, 20, 30]

        Container container = new Container();
        container.value = 5;
        modifyContainer(container);
        System.out.println("After modifyContainer: " + container.value); // Output: 10
    }

    public static void modifyArray(int[] array) {
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
    }

    public static void modifyContainer(Container container) {
        container.value = 10;
    }

    static class Container {
        int value;
    }
}
```

In this example, the modifyArray method receives a copy of the array reference. By modifying the contents of the array, the changes are visible outside the method. Similarly, the modifyContainer method receives a copy of the reference to the Container object. By modifying the object's state via the reference, the changes can be observed outside the method.