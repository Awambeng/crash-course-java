package chaper10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ErrorExceptionClass {
    static{
        int[] array = new int[3];
        //int num = array[-1]; // throws an exception since there is no negative index in an array.
        // this throws an ExceptionInitializerError since the static initializer throws the exception without handling it.
    }

    // testing the StackOverflowError
    public static void danger(int a){
        // danger(1);
    }

    // void eat(){
    //     try{
    //         // some code
    //     }catch(IOException e){
    //                     System.out.println("");
    //     }catch(FileNotFoundException e){ // does not compile becaue code is unreachable since IOException is a parent class to FileNotFoundException class 
    //                     System.out.println(""); 
    //     }
    // }

    void eat() {
        try{
            // some code here.
            BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("file not found");
        }catch(IOException e1){
            System.out.println("check input");
        }finally{
            System.out.println("end of try and catch statement...");
            // System.exit(1);
        }
    }

    void tryWithResource() throws Exception{
        try(var in = new FileInputStream("file.txt"); 
        var out = new FileOutputStream("file.txt")){
            // some code here.
        }
    }

    void read() throws Exception{
        try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // the try with resource statement has a finally block that is created by the compiler to close all the resources when the try statement is finish.
    // the catch statement is optional when using the try with resource statement if you add the exception after the method declaration as seen in the example above.
    // note that the implicit finally block provided by the compiler when working with try with resource statement is executed first before the catch and finally block defined by the programmer.
    // when working with try with resource statement the resources are closed in reversed order of creation meaning the last resource created will be the first to be close and the first resource created will be the last to be close.


    public static void main(String[] args) {
        System.out.println("testing ExceptionInitializerError....");
        // ErrorExceptionClass.danger(1);
        new ErrorExceptionClass().eat();
        try{
            System.out.println(Integer.parseInt(args[1]));
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
            System.out.println("Missing or invalid input...");
        }
    }
}
