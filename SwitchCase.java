public class SwitchCase {
    public static void main(String[] args){
        int dayOfTheWeek = 3;
        switch(dayOfTheWeek){
            default:
                System.out.println("Please enter a valid day of the week");
                break;

            case 0: 
                System.out.println("The day of today is Sunday");
                break;
            
            case 1:
                System.out.println("The day of today is Monday");
                break;

            case 2: 
                System.out.println("The day of today is Tuesday");
                break;

            case 3:
                System.out.println("The day of today is Wednesday");
                break;

            case 4: 
                System.out.println("The day of today is Thursday");
                break;

            case 5: 
                System.out.println("The day of today is Friday");
                break;

            case 6:
                System.out.println("The day of today is Saturday");
                break;

        }

        SwitchCase.getSortedOrder();


    }

    private static int getSortedOrder(){
        final String firstName = "Test";
        final String middleName = "Patricia";
        final String suffix = "JR";
        final String lastName = "titi";
        int id = 0;
        switch(firstName){
            case "Test":
                System.out.println(firstName);
                return 52;

            case middleName:
                System.out.println(middleName);
                id = 5;
                break;

            case suffix:
                id = 0;
                break;

            case lastName:
                id = 8;
                break;
        }
        return id;
    }

}
