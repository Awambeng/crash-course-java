public class Statement {
    public String greeting(int hourOfDay){
        String result = (hourOfDay < 0 || hourOfDay > 23) ? "Please enter a valid hour of a day between 0 and 23 ..." : 
        (hourOfDay <= 11) ? "Good Morning" : 
        (hourOfDay <= 16) ? "Good Afternoon" : 
        (hourOfDay <= 23) ? "Good Evening" : " ";
        return result;
    }
    public static void main(String[] args){
        Statement s = new Statement();
        String res = s.greeting(15);
        System.out.println(res);
        boolean isRaining = true;
        int a = 6;
        int b = 5;
        if(isRaining)
            System.out.println("It's raining");
        else
            System.out.println("It's not raining");

        if(a == b)
            System.out.println("a equals b");
        else if (a > b)
            System.out.println("a is greater than b");
        else
            System.out.println("none");

        int hourOfDay = 4;
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

    int x = 4;
    int y = 6;
    int z = (x > y) ? x++: y++;
    System.out.println(x + "," + y);
    }
    
}
