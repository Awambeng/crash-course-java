import java.util.ArrayList;

public class WaterBottle {
 private String brand;
 private boolean empty;
 public static void main(String[] args) {

    WaterBottle wb = new WaterBottle();

    System.out.print("Empty = " + wb.empty);

    System.out.print(", Brand = " + wb.brand);
    ArrayList<Integer> val = new ArrayList<>();
    val.add(4);
    val.add(5);
    val.set(1, 6); // the set() in arraylist is used to update an element at a given position in the arraylist
    val.remove(0);
    for (Integer v : val) System.out.println(v);
 } }
