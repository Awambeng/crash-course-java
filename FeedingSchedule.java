class FeedingSchedule{
    public static void main(String[] args){
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while(count++ < 3){
            int y = (1 + 2 * count) % 3;
            switch(y){
                default:
                case 0: x -= 1; break;
                case 1: x += 5;
            }
        }
        
        System.out.println(x);
        System.out.print("a");try {
        System.out.print("b");
        throw new IllegalArgumentException();
        } catch (RuntimeException e) {
        System.out.print("c");
        } finally {
        System.out.print("d");
        }
        System.out.print("e");
    }
}