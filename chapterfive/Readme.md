## Class Design

- In java, a class can only extend a single class. If you want to prevent a class from being extended you can define the class using the final keyword.
- An abstract class is a class with abstract and non-abstract methods.
- Access modifiers are used to define classes but we mostly use the public and the protected to define our classes and when dealing with inner classes we can use the protected and the private access modifier.
- In java, all classes inherit from the class Object found in the package java.lang and the class java.lang.Object is the only class in java that doesn't have a parent class.
- The this() keyword is used to call a constructor within the class while the super() keyword is used to call constructor from the parent class. Both keywords are used on the first line of the constructor.

## super() vs. super
- this() and this are unrelated in Java. Likewise, super() and super are quite different but may be used in the same methods on the exam. The ﬁrst, super(), is a statement that explicitly calls a parent constructor and may only be used in the ﬁrst line of a constructor of a child class. The second, super, is a keyword used to reference a member deﬁned in a parent class and may be used throughout the child class.
The exam may try to trick you by using both super() and super in a constructor. For example, consider the following code:
```java
public Rabbit(int age) {
    super();
    super.setAge(10);
}
```
The ﬁrst statement of the constructor calls the parent’s constructor, whereas the second statement calls a function deﬁned in the parent class. Contrast this with the following code, which doesn’t compile:
```java
public Rabbit(int age) {
    super; // DOES NOT COMPILE
    super().setAge(10); // DOES NOT COMPILE
}
```
This code looks similar to the previous example, but neither line of the constructor will compile since they are using the keywords incorrectly. When you see super() or super on the exam, be sure to check that they are being used correctly.

## When overriding a class the following should be considered.
- The method in the child class should have thesame signature as the method in the parent class.
- The method in the child class must be atleast accessible or more accessible than the method in the parent class. Meaning if the method in the parent class was implemented using a protected access modifier when overriding the method you need to use protected access modifier (at least accessible) or you can use public access modifier (more accessible) than parent class method.
- The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
- If the method returns a value, it must be thesame or a subclass of the method in the parent class, known as <b style="color: green">Covariant return type</b>

## Hiding Static Methods
Method hiding is similar but not exactly the same as method overriding. First, the four previous rules for overriding a method must be followed when a method is hidden. In addition, a new rule is added for hiding a method, namely that the usage of the static keyword must be the same between parent and child classes. The following list summarizes the five rules for hiding a method:
- The method in the child class must have the same signature as the method in the parent class.
- The method in the child class must be at least as accessible or more accessible than the method in the parent class.
- The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
- If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.
- The method defined in the child class must be marked as static if it is marked as static in the parent class (method hiding). Likewise, the method must not be marked
as static in the child class if it is not marked as static in the parent class (method overriding).

- Note: We cannot override final and static method instead when dealing with static method we can hide the implementation. You cannot hide a static method if it is final in the parent class.

## Inheriting Variables
As you saw with method overriding, there were a lot of rules when two methods have thesame signature and are defi ned in both the parent and child classes. Luckily, the rules for variables with the same name in the parent and child classes are a lot simpler, because Java doesn’t allow variables to be overridden but instead hidden.

## Creating Abstract classes
- An abstract class in java is a class that is marked with the abstract keyword and cannot be instantiated. 
- An abstract method is a method marked with the abstract keyword defined in an abstract class for which no implementation is provided in the class in which it is declared.

The following code is based on our Animal and Swan description:
```java
public abstract class Animal {
    protected int age;
    public void eat() {
        System.out.println("Animal is eating");
    }
    public abstract String getName();
}
```

```java
public class Swan extends Animal {
    public String getName() {
        return "Swan";
    }
}
```

The first thing to notice about this sample code is that the Animal class is declared abstract and Swan is not. Next, the member age and the method eat() are marked as protected and public, respectively; therefore, they are inherited in subclasses such as Swan. Finally, the abstract method getName() is terminated with a semicolon and doesn’t provide a body in the parent class Animal. This method is implemented with the same name and signature as the parent method in the Swan class.

- Note: An abstract class may contain non abstract methods and variables. An abstract class is not required to have an abstract method. Example:

```java
public abstract class Cow{ // an abstract class without an abstract method

}
```

- Note: Abstract classes can only be defined in abstract classes. Example:
```java
public class Chicken{
    public abstract void eat(); // does not compile because the abstract method was not declared in an abstract class.
}
```

- Note: An abstract class with an implementation or a body will not compile. Example:
```java
public abstract class Chicken{
    public abstract void eat(){ } // does not compile because of the curly braces { }
    public abstract String greet(){
        return "Hello from wrong abstract method definition"; // does not compile because of the implementation.
    }
}
```

- Note: An abstract class cannot be declared as final. If you declare a class as final then you are saying that class can never be instantiated, so the compiler will refuse to process the code. Example:

```java
public final abstract class Tortoise{
    // does not compile
}
```

Likewise, an abstract method may not be marked as final for the same reason that an abstract class may not be marked as final. Once marked as final, the method can
never be overridden in a subclass, making it impossible to create a concrete instance of the abstract class.
```java
public abstract class Goat {
    public abstract final void chew();
}
```

- Finally, a method cannot be marked as abstract and private because remember when a method is private it means it is reserved to that class so subclasses will not be able to have access to the abstract method. Example:
```java
public abstract class Whale{
    private abstract void sing(); // does not compile.
}
```

```java
public class HumpbackWhale extends Whale{
    private void sing(){
        SYstem.out.println("Humpback whale is singing");
    }
}
```

- When an abstract class extends another abstract class it is not required to implement the abstract methods in the parent abstract class but when the first concrete class (non abstract class) extends an abstract class it must implement all the abstract methods defined in the child abstract class and parent abstract class but if the child implements a specific abstract method defined in the parent abstract class then that concrete class is not oblarge to implement that method again.

The following are lists of rules for abstract classes and abstract methods that we have covered in this section. Review and understand these rules before taking the exam.

## Abstract Class Deﬁnition Rules:
- Abstract classes cannot be instantiated directly.
- Abstract classes may be defined with any number, including zero, of abstract and non-abstract methods.
- Abstract classes may not be marked as private or final.
- An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods.
- The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.

## Abstract Method Deﬁnition Rules:
- Abstract methods may only be defined in abstract classes.
- Abstract methods may not be declared private or final.
- Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.
- Implementing an abstract method in a subclass follows the same rules for overriding a method. For example, the name and signature must be the same, and the visibility of the method in the subclass must be at least as accessible as the method in the parent class.

## Implementing Interfaces
- An interface is an abstract data type that defines a list of abstract public methods that any class implementing the interface must provide.

## Defining an Interface
It may be helpful to think of an interface as a specialized kind of abstract class, since it shares many of the same properties and rules as an abstract class. The following is a list of rules for creating an interface, many of which you should recognize as adaptions of the rules for defi ning abstract classes.

- Interfaces cannot be instantiated directly.
- An interface is not required to have any methods.
- An interface may not be marked as final.
- All top-level interfaces are assumed to have public or default access, and they must include the abstract modifier in their definition. Therefore, marking an interface as private, protected, or final will trigger a compiler error, since this is incompatible with these assumptions.
- All nondefault methods in an interface are assumed to have the modifiers abstract and public in their definition. Therefore, marking a method as private, protected,
or final will trigger compiler errors as these are incompatible with the abstract and public keywords.

## Inheriting an Interface
There are two inheritance rules you should keep in mind when extending an interface:

- An interface that extends another interface, as well as an abstract class that implements an interface, inherits all of the abstract methods as its own abstract
methods.
- The first concrete class that implements an interface, or extends an abstract class that implements an interface, must provide an implementation for all of the inherited abstract methods.

- Note: In java we cannot have two methods with thesame name and same number of parameter list even if they have different return types. 

## Interface Variables
We can define variables in an interface but it must be public and can be static or final. Below are two interface variables rules.

- Interface variables are assumed to be public, static and final. Therefore, marking a variable as private or protected will trigger a compiler error.
- The value of an interface variable must be set when it is declared since it is marked as final.

## Default Interface Methods
A default method is a method defined within an interface with the default keyword in which a method body is provided. So a default method in simple words is just a method that is defined or created using the default keyword and has a body. Exampple:
```java
public interface MyInterface{
    public default void eat(){
        System.out.println("eating");
    }
}
```

The following are the default interface method rules you need to be familiar with: 

- A default method may only be declared within an interface and not within a class or abstract class.
- A default method must be marked with the default keyword. If a method is marked as default, it must provide a method body.
- A default method is not assumed to be static, final, or abstract, as it may be used or overridden by a class that implements the interface.
- Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private or protected.

- Note: If a class implements two interfaces that have default methods with the same name and signature, the compiler will throw an error. There is an exception to this rule, though: if the subclass overrides the duplicate default methods, the code will compile without issue—the ambiguity about which version of the method to call has been removed.

## Static Interface Methods
A static method defined in an interface is not inherited in any classes that implement the interface. Here are the static interface method rules you need to be familiar with:

- Like all methods in an interface, a static method is assumed to be public and will not compile if marked as private or protected.
- To reference the static method, a reference to the name of the interface must be used.

The following is an example of a static method defined in an interface:
```java
public interface Hop {
    static int getJumpHeight() {
        return 8;
    }   
}
```

## Understanding Polymorphism
Polymorphism is the property of an object to take on many different forms.

Here are some basic rules to keep in mind when casting variables:

- Casting an object from a subclass to a superclass doesn’t require an explicit cast.
- Casting an object from a superclass to a subclass requires an explicit cast.
- The compiler will not allow casts to unrelated types.
- Even when the code compiles without issue, an exception may be thrown at runtime if the object being cast is not actually an instance of that class.

