/**
 * Created by malviyas on 7/26/2017.
 */
public class Car implements Comparable<Car> {
    private int carId;
    private String brand;
    private double price;

    public Car(int carId, String brand, double price) {
        this.carId = carId;
        this.brand = brand;
        this.price = price;
    }
    public int compareTo(Car car){
        if(this.price == car.price)
            return 0;
        else if(this.price > car.price)
            return 1;
        return -1;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
