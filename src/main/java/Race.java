import java.util.ArrayList;
import java.util.List;

class Race {
    List<Car> cars = new ArrayList<>();
    public void addCar(Car car) {
        cars.add(car);
    }
    public Car getFastestCar() {
        Car fastestCar = null;

        for (Car car : cars) {
            if (fastestCar == null || car.speed > fastestCar.speed) {
                fastestCar = car;
            }
        }
        return fastestCar;
    }
    public int distanceIn24Hours(int speed) {
        return speed * 24;
    }
}