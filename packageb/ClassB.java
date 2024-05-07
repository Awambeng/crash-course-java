package packageb;

import packagea.*;

public class ClassB {
    int a;
    String surname; // instance variable
    static String name = "Bolan"; // class or static variable 
    public void add(){
        int b = 10;
        System.out.println(a+b);
    }

    public ClassB(String surname){
        this.surname = surname;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getSurName(){
        return surname;
    }

    public void findAnswer(boolean check) {
        int answer;
        int onlyOneBranch;
        if (check) {
        onlyOneBranch = 1;
        answer = 1;
        } else {
        answer = 2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneBranch); // DOES NOT COMPILE
        }
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.greetUser();
        // new ClassB().add();
        // new ClassB().findAnswer(true);
        ClassB b1 = new ClassB("object 1");
        ClassB b2 = new ClassB("object 2");
        b1.setName("Rodrick");
        System.out.println(b1.getSurName() + " " + b1.name);
        System.out.println(b2.getSurName() + " " + b2.name);
    }
}
