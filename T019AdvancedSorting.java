import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cars {
    public String brand;
    public String model;
    public int year;

    public Cars(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}


class SortByYear implements Comparator {

    public int compare(Object obj1, Object obj2) {
        Cars a = (Cars) obj1;
        Cars b = (Cars) obj2;

        if(a.year < b.year) return -1;
        if(a.year > b.year) return 1;
        return 0;
    }
}


public class T019AdvancedSorting {

    public static void main(String[] args) {
        ArrayList<Cars> dealer = new ArrayList<Cars>();
        dealer.add(new Cars("BMW", "X5", 2014));
        dealer.add(new Cars("BMW", "X2", 2004));
        dealer.add(new Cars("CyberTruck", "C1", 2023));

        // using the comparator to sort the cars
        Comparator sorter = new SortByYear();
        Collections.sort(dealer, sorter);

        // displaying the cars
        for(Cars car : dealer) {
            System.out.println(car.brand + "\t" + car.model + "\t" + car.year);
        }
    }
}
