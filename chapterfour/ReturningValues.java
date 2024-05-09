package chapterfour;

public class ReturningValues {
    public static void main(String[] args) {
        int number = 1;
        String letters = "abc";
        number(number);
        letters = letters(letters);
        System.out.println(number + letters);
    }

    public static int number(int number){
        number++;
        return number;
    }

    public static String letters(String letters){
        letters += "d";
        return letters;
    }
}
