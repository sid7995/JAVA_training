import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by malviyas on 7/26/2017.
 */
public class CarSort {
    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>(new BrandComparator());
        cars.add(new Car(1, "BMW", 200000.0));
        cars.add(new Car(4, "PORCHE", 100000.0));
        cars.add(new Car(2, "TATA", 250000.0));
        cars.add(new Car(9, "RENAULT", 20000.0));
        cars.add(new Car(43, "HYUNDAI", 800000.0));
        cars.add(new Car(42, "HONDA", 30000.0));
        cars.add(new Car(8, "CHEVROLET", 2000.0));
        cars.add(new Car(5, "JAGUAR", 500000.0));
        cars.add(new Car(99, "MARUTI", 210000.0));
        cars.add(new Car(78, "AUDI", 910000.0));

        Iterator<Car> itr = cars.iterator();
        while (itr.hasNext()) {
            Car val = itr.next();
            System.out.println(val.getPrice() + " " + val.getBrand() + " " + val.getCarId());
        }


    }
}
