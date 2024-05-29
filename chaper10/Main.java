package chaper10;

import java.io.IOException;

public class Main {

    // example of throwing a checked exception in java
    void fall(int distance) throws IOException{ // IOException is a checked exception because it inherits the Exception class.
        if(distance > 10){
            throw new IOException();
        }
    }

    // the throws keyword means that the method might or might not throw an exception while the throw keyword means that the method is 
    // declaring it wants to throw an exception.

    // example of handling an exception in java.
    void fallHandleException(int distance) {
        if(distance > 10){
            try{
                throw new IOException();
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }

    void fall() throws Exception, IOException{ // use of throws keyword to declare the exceptions the method supports 
        throw new IOException(); // use of throw keyword to throw an exception
        // throw new Exception(); // does not compile because this line of code is unreachable since the line above already throws an exception. 
    }

    void fall1(String input){
        System.out.println(input.toLowerCase());
    }

    public static void main(String[] args) {
        // new Main().fall1(null);
        String a = "hello";
        int c = 2;
        String d = String.valueOf(c);
        // int b = Integer.parseInt(a); // throws a RuntimeException because we can't convert from a string to an int.
        //System.out.println(b); // throws a RuntimeException because we can't convert from a string to an int.
        System.out.println(d.length());
    }
}
