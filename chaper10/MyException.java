package chaper10;

public class MyException {
    public static void main(String[] args) {
        //System.out.println(2/0); // throws RuntimeException 
        int[] array = new int[0];
        // System.out.println(array[0]); // throws ArrayIndexOutOfBoundsException
        String type = "moose";
        // Integer number = (Integer) type; // does not compile
    }
}
