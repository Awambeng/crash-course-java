class _C {
    private static int $_;
    private static String text;

    public static void main(String[] main){
        String a_b;
        System.out.println($_);
        System.out.println(text);
        //System.out.println(a_b); // compiler error because the variable was not initialised
        String s1 = "java";
        String s2 = "java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }
}
