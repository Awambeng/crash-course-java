public class BreakStatement {
    // implementing search of an element position in an array
    public static void main(String[] args){
        int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;
        PARENT_LOOP: for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
                if(list[i][j] == searchValue){
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if(positionX == -1 || positionY == -1){
            System.out.println(searchValue + " Element not found");
        }else{
            System.out.println(searchValue + " Element found at position (" + positionX + ", " + positionY + ")");
        }

        FIRST_CHAR_LOOP: for(int a = 1; a <= 4; a++){
            for(char x = 'a'; x <= 'c'; x++){
                if(a == 2 || x == 'b')
                    continue FIRST_CHAR_LOOP;
                    System.out.print(" " + a + x);
            }
        }
        System.out.println();

        boolean a = true;
        boolean b = true;
        if(a == b){
            System.out.println("a and b are equal");
        }

        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    }
}
