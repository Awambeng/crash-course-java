import java.util.ArrayList;
import java.util.List;

public class WhileLoop {
    public static void main(String[] args){
        String[] names = {"Toto", "Titit", "Hush", "Junior"};
        int a = 6;
        int b = 5;
        while(a > b){
            System.out.println(a + " is greater than " + b);
            b++;
        }

        do{
            a++;
            System.out.println(a);
        }while(a==5);

        for(String name : names){
            System.out.println(name);
        }
        int i = 0;
        for(; i < names.length; i++){
            System.out.println(names[i]);
        }

        // infinite loop creation
        // for( ; ; ){
        //     System.out.println("Hello World");
        // }

        List<String> studentNames = new ArrayList<>();
        studentNames.add("StudentA");
        studentNames.add("StudentB");
        studentNames.add("StudentC");
        for (String studentName : studentNames){
            System.out.print(studentName + ", ");
        }

        for (int j = 0; j < studentNames.size(); j++) {
            String name = studentNames.get(j);
            if(j > 0){
                System.out.print(", ");
            }
            System.out.print(name);
        }
    }
}
