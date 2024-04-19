class JavaOperator{

    public static void main(String [] args){
        int x = -20;
        int y = 20;
        int z = -10;
        boolean isCold = true; 
        short a = 10;
        short b = 10;

        // working with arithmetic operators
        System.out.println("working with arithmetic operators");
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println((float)x/y);
        System.out.println(x%y);
        System.out.println(z>>>3);
        a = (short)(a + b);
        a += b;
        System.out.println(a);

        // // working with unary operators
        System.out.println(++x + ++x);
        System.out.println(++y + y++);
        System.out.println(~z);
        System.out.println(!isCold);
    }
}