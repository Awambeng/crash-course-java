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
 */
