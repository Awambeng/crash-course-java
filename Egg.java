public class Egg {
    public Egg() {
        number = 15;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
        System.out.println(egg);
                              
        System.out.println(015); //octal 15 base 8 (1 x 8^1) + (5 x 8^0) = 8 + 5 = 13
        System.out.println(0XAB); // hexadecimal 10 base 16 + 11 base 16 = (10 x 16^1) + (11 x 16^0) = 160 + 11 = 171
        System.out.println(0B101); // binary (1 x 2^2) + (0 x 2^1) + (1 x 2^0) = 4 + 0 + 1 = 5
    }
    
    private int number = 3;

    /**
     * an instance initializer is a block of 
     * code wriiten out of a method. example 
     * of an instance initializer is 
     * {System.out.println("Hello");}
     */
    { number = 4; }  // this is an instance initializer
    
}