import java.util.LinkedList;

public class T010LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Mitsubishi");
        cars.add("toyota");
        cars.add("Audi");
        cars.remove(1);
        cars.add(0, "Truck");

        System.out.println(cars);
    }
}
