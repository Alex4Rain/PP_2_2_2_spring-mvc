package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private List<Car> cars = new ArrayList<>();

    private List<Car> getCars(int count) {
        if (cars.isEmpty()) {
        cars.add(new Car("BMW", "525", 785));
        cars.add(new Car("Audi", "A4", 618));
        cars.add(new Car("Toyota", "Hilux", 214));
        cars.add(new Car("Skoda", "Rapid", 412));
        cars.add(new Car("Ford", "Mondeo", 397));
        }
        if (count < 5 && count > 0) {
            return cars.subList(0, count);
        } else {
            return cars;
        }

    }
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        if (count == null) {
            count = 0;
        }
        model.addAttribute("cars", this.getCars(count));
        return "cars";
    }

}
