package chapterfour.blessing;

public class JavaStringRevision{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("test ");
        sb.append("null");
        System.out.println(sb);
        String name="\t     dhhdblessing";
        String trimmed = name.trim();
        String res = trimmed.substring(4);

        System.out.println("res: " + res);

        String res1 = name.trim().substring(4);
        System.out.println("res1: " + res1);

        name = name.trim();
        System.out.println(name);
        name = name.substring(4);
        System.out.println(name);


        String firname="chendi";
        String s1 ="1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);

        String t = new String("test");
        t = t.concat("string");
        
        System.out.println(firname +" "+ name);
    }
}

class Mutable{
    private String s;
    public void setS(String newS){s=newS;}
    public String getS(){return s;}
}
final class Immutable{
    private String s;
    public String getS(){return s;}
}