package parttwo.chapterone;

public enum Season implements Manage{
    WINTER("Low"){
        @Override
        public String getHours(){
            return "9am - 4pm";
        }
    }, 
    SPRING("Medium"), 
    SUMMER("High"), 
    FALL("Medium"); 
    // when an enum contains only enum values the semi-colon at the end of the list is optional but when anything comes in the semi-colon is required.
    // the final used in declaring the fields in an enum is not required but a good practice to follow when working with enums because enum values are shared amongst all processes so we will not want a situation where these values changes therefore making it immutable by declaring as final.

    // declaring a field
    private final String expectedVisitors;

    /*
     * enums doesn't take only enum values but can also take a constructor, fields and methods.
     * note: enums accepts only private constructors.
     */
    Season(String expectedVisitors){
        this.expectedVisitors = expectedVisitors;
    }

    public String getHours(){
        return "9am - 3pm";
    }

    // declaring a method
    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }

    // the use of access modifiers when declaring an enum is optional but in case you want to use access modifiers only default and private is supported in an enum.

}

interface Manage{
    public abstract String getHours();
}