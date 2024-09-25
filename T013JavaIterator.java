import java.util.ArrayList;
import java.util.Iterator;

public class T013JavaIterator {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("vitz");
        cars.add("runz");
        cars.add("k-truck");

        Iterator<String> itr = cars.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
