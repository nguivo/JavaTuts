import java.util.ArrayList;

public class T008ArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("pickup");
        cars.add(0, "mazda"); // adding an element at index 0

        System.out.println(cars);
    }
}
