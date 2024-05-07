# String Pool
- A string pool in java is also known as the intern pool and it is just a location in the java virtual machine (JVM) that collects all the strings used in a given application.

In java a string is just a sequence of characters and java starts indexing a string from 0 for example:

String animal = "Lion";

this is how java indexes the string Lion:

    L i o n
    0 1 2 3

Some methods of the String class in java.

a. Length():
    This method returns the number of characters in the string. Example:

    In the String "Lion" we have 4 characters.