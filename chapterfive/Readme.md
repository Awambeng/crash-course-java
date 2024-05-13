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