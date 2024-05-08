package chapterfour;

public class AnotherExample{
    
    private static int one;
    private static final int two;
    private static final int three = 3;
    //private static final int four; // does not compile

    static{
        one = 1;
        two = 2;
        //three = 3; // does not compile because we are trying to reassign the value of a final field.
        //two = 4; // does not compile because we are trying to reassign the value of a final field.
    }
    public static void main(String[] args) {
        System.out.println("hey");
    }
}
