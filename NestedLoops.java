public class NestedLoops {
    public static void main(String[] args){
        // nested for loop example
        int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int[] number : numbers){
            for(int i = 0; i < number.length; i++){
                System.out.print(number[i] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // nested for loop example
        /* a label is just a meta data we can add to a statement
         for example outer_loop and inner_loop are labels
        */
        /**
         * labels follow thesame rules or naming conventions like
         * identifiers. They can start with:
         * - letters either higher or lowercase
         * - they can start with special characters like $ and _ (underscore)
         * - they are written in uppercase to improve readability and separated with underscores (_)
         */
        outer_loop: for(int j = 0; j < numbers.length; j++){
            inner_loop: for(int i = 0; i < numbers.length; i++){
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // using do-while loops with nested loops
        int x = 20;
        while(x > 0){
            do{
                x -= 2;
                System.out.println("After subtracting 2 from x the new value of x becomes " + x);
            }while(x > 5);
            x--;
            System.out.print(x + "\t");
        }
    }
}
