import java.util.ArrayList;
import java.util.Collections;

public class T009CollectionsClass {

    public  static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("toyota");
        cars.add("mazda");
        cars.add("preus");
        cars.add("ford");

        Collections.sort(cars);
        for (String i: cars) {
            System.out.println(i);
        }
    }
}
