package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public List<Car> getAllCars() {
        cars.add(new Car("RangeRover", "White", 777));
        cars.add(new Car("Mercedes", "Black", 171));
        cars.add(new Car("BMW", "Grey", 234));
        cars.add(new Car("Porsche", "Красный", 456));
        return  cars;

        public List<Car> getCars(int count) {
            if (count >= 5 || count < 1) {
                return cars;
            }
            return cars.subList(0, count);
        }

    }
}