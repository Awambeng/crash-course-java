package chapterfour;

public class NotImmutable {
    private StringBuilder builder;
    public NotImmutable(StringBuilder b) {
        builder = new StringBuilder(b); // creating a copy of builder so that changes made by the caller won't affect the instance variable.
    } 

    public StringBuilder getBuilder(){
        return new StringBuilder(builder); // creating too a copy of the builder for same purpose as above.
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable ni = new NotImmutable(sb);
        sb.append(" appended");
        StringBuilder gotBuilder  = ni.getBuilder();
        gotBuilder.append(" more");
        System.out.println(ni.getBuilder());
    }
}
