## Exceptions in java

In java the class Throwable is the parent class to all Exception classes, including the Error class, Exception class. The Exception class is also a superclass of the Runtime exception class. It is not advisable to handle Throwable and Error exceptions in your code.

The are two types of exceptions in java, Checked and Uchecked exceptions.

1. Checked Exceptions:
Checked exceptions are exceptions that must be declared and handled by the application code where it is thrown. In java checked exceptions inherit the Exception class but not the Runtime class. Checked exceptions also include any class that inherits Throwable but not Error or RuntimeException class.

Note: Checked exceptions? what are we checking? Java has a rule called handle or declare rule. This rule means that all checked exceptions that could be thrown within a method are either wrapped in compatible try and catch blocks or declared in the method signature.

The difference between the checked exception and unchecked exception is that the checked exception must be handled or declared while unchecked exceptions may be handled or declared.

2. Uchecked Exceptions:
An unchecked exception is an exception that does not need to be declared or handled by the application code where it is thrown. Unchecked exceptions are often known as Runtime exceptions, although in java any class that inherits the Runtime or Error exception class is considered an unchecked exception.

## throws vs throw keyword.
The throw keyword is used inside a block of code usually in a method to say that method should throw an exception while the throws keyword is used at the end of the method declaration to specify the type of exception that method supports.

Example:

```java
public class Main{
    void fall() throws Exception, IOException{ // use of throws keyword to declare the exceptions the method supports 
        throw new IOException(); // use of throw keyword to throw an exception
    }
}
```

## Recognizing Exceptions.
a. RuntimeException is a subclass of the Exception class and all the subclasses of the RuntimeException class are unchecked exceptions that can be handled either by the programmer of the JVM (Java Virtual Machine). Below are the types of RnntimeException classes.

1. ArithmeticException: thrown when the code attempts to divide a number by 0
2. ArrayIndexOutOfBoundsException: thrown when the code attempts to access an invalid index of an array.
3. ClassCastException: thrown when you try to cast an object to a class of which it is not an instance of.
4. NullPOinterException: thrown when there is a null reference when an object is required.
5. IllegalArgumentException: thrown when a programmer tries to call a method with insufficient parameters.
6. NumberFormatException: It is a subclass of IllegalArgumentException and it is thrown when an attempt is made to convert a string to a numeric type.

b. Checked Exception classes: Checked exceptions are subclasses of the Exception class but not the RuntimeException class and must be declared or handled. The common checked exceptions are:

1. IOException: thrown when there is a problem reading or writing a file.
2. FileNotFoundException: It is a subclass of the IOException thrown when the code tries to reference a file that does not exist.

c. Error classes: Error are unchecked exceptions that extend the error class. They are not thrown by the JVM and should not be handled or declared. Errors are rare but you might see them in the exam.

1. ExceptionInitializerError: thrown when a static initializer throws an exception and doesn't handle it.

2. StackOverflowError: thrown when a method calls itself so many times (this is called infinite recursion because the method calls itself many times without an end).

3. NoClassDefFoundError: thrown when a class is available at compile time but not at runtime.


## Handling Exceptions.
We can handle exceptions in java using the try and catch statement and its syntax is as follows:

```java
try{
    // block of code (protected code).
}catch(exception_type identifier){
    // exception handler.
}
```

Note: When working with chaining catch blocks in java make sure to check the relationship between the different classes because if a catch block consist of a superclass and a subclass and that the superclass is first caught before the sublclass the subclass when caught after the superclass declaration will not be reachable hence causing a compiler error so take note whereas going the other way round works perfectly.

Demonstration:
```java
void eat(){
    try{
        // some code
    }catch(IOException e){
        System.out.println("catch parent class exception...");
    }catch(FileNotFoundException e){ // does not compile becaue code is unreachable since IOException is a parent class to FileNotFoundException class 
        System.out.println("catch subclass exception...");
    }
}
```

Changing the order that is putting the subclass first and parent class second will work. 

Demonstration:
```java
void eat(){
    try{
        // some code here.
    }catch(FileNotFoundException e){
        System.out.println("catch subclass exception...");
    }catch(IOException e){
        System.out.println("catch superclass exception...");
    }
}
```