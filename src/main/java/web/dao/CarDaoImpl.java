package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = new ArrayList<>();

    private void addCars() {
        cars.add(new Car("BMW", "525", 785));
        cars.add(new Car("Audi", "A4", 618));
        cars.add(new Car("Toyota", "Hilux", 214));
        cars.add(new Car("Skoda", "Rapid", 412));
        cars.add(new Car("Ford", "Mondeo", 397));
    }

    public List<Car> getCars(int count) {
        if (cars.isEmpty()) {
            this.addCars();
        }
        if (count < 5 && count > 0) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}
