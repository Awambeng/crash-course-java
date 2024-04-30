public class Finalizes {

    protected void finalize(){
        System.out.println("Calling finalize...");
    }

    public static void main(String[] args){
        Finalizes f = new Finalizes();
        f.finalize();
    }
}
