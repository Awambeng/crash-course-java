package parttwo.chapterone;

public final class Reptile {
    /*
     * 1. working with final classes.... Once this is done then that class cannot be extended.
     * 2. classes cannot also be marked as abstract and final at thesame time.
     * 3. interfaces cannot be marked as final
     */

    public static void main(String[] args) {
        var season = Season.SUMMER;
        System.out.println(season);
        System.out.println(Season.SUMMER);
        var compare = (season == Season.SUMMER) ? true : false;
        System.out.println(compare);
        var compare1 = (season.equals(Season.SUMMER)) ? true : false;
        System.out.println(compare1);
        for (var res : season.values()){
            var s = res.valueOf(res.name());
            if (s == res.SUMMER){
                System.out.println("search found");
            }
            System.out.println(res.name() + " is declared at index : " + res.ordinal());
        }

        // how to retrieve the value of an enum from a String using the valueOf() method.
        var s = season.valueOf("SUMMER"); // note you must provide the exact value of the enum constant
        if(s == season.SUMMER){
            System.out.println("they are equal");
        }else{
            System.out.println("they are not equal");
        }
        season.printExpectedVisitors();
        // calling a method defined in an enum
        Season.WINTER.printExpectedVisitors();
    }
}

// case 1:
//class Snake extends Reptile { }// does not compile because the Reptile class is declared as final.

//case 2:
//abstract final class Eagle{} // does not compile because the Eagle class is declared as final.

// case 3:
//final interface Hawk{} // deos not compile because the Hawk interface is declared as final.

/* working with enums
 *
 * An enum is a special type of class that represents a group of constants.
 * for example days of the week, months of the year, or states of the USA.
 * 
 * enums are declared using the enum keyword.
 * 
 * note: enums can be compared with == because they are static and final. we can also use equals() method to compare enums.
 * 
 * enums provide a method values() that gets the array of values.
 * enums also provide a helper method name() that gets the name of the enum and a ordinal method to get the index of the enum.
 * 
 */


