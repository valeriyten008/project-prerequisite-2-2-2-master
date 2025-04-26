package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Kia", "White", 777));
        cars.add(new Car("Lotus", "Black", 171));
        cars.add(new Car("Mercedes", "Grey", 234));
        cars.add(new Car("BMW", "Blue", 456));
        cars.add(new Car("Daewoo", "Red", 456));
    }

    public List<Car> getAllCars() {
        return cars;
    }

        public List<Car> getCars ( int count){
            if (count >= cars.size()) {
                return cars;
            } else {
                return cars.subList(0, count);
            }
    }
}
