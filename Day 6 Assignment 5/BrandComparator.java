import java.util.Comparator;

/**
 * Created by malviyas on 7/26/2017.
 */
public class BrandComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return (car1.getBrand().compareTo(car2.getBrand()));


    }
}
