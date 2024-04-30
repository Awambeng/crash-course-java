public class Variables {
    public static void findAnswer(boolean check){
        int answer;
        int onlyOneBranch;
        if(check){
            onlyOneBranch = 1;
            answer = 1;
        }else{
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch);
    }

    // public static void main(String[] args){
    //     a =5;
    //     System.out.println(a);
    //     Variables.findAnswer(true);
    // }
        public void addTwoNumbers(){
             a = 4;
             b = 3;
             System.out.println(a + b);
       }
       public static final void main(String[] args){
            Variables mv = new Variables();
            mv.addTwoNumbers();
       }
  
    int a;
    int b;
    int c;

    
}
