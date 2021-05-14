package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "Opel Vectra C", 2007));
        cars.add(new Car(2L, "Chevrolet Camaro", 2017));
        cars.add(new Car(3L, "Mitsubishi GTX", 2011));
        cars.add(new Car(3L, "Mercedes CLS", 2012));
        cars.add(new Car(3L, "Лада Калина", 2015));
        return cars;
    }
}
