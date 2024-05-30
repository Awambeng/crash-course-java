## Chapter 1: Java fundamentals
The final keyword can be applied to classes, methods and even variables. When we declare a variable as final it means we cannot reassign that variable using a compound operator. Example:
```java
public class Main{
    public static void main(String ... args){
        final int count = 3;
        //count = 4; // does not compile because it was marked final
    }
}
```
Note: It's is a good practice of declaring final fields with uppercase letters. For example instead of using ```count``` as used above we can rewrite all the characters in uppercase to have ```COUNT```.

- Marking a method as final means that method cannot be overriden. Also marking a class as final means that class cannot be extended.

