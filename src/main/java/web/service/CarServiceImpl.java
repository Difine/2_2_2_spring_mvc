package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private final List<Car> carList = List.of (
            new Car ("Х439ВК", 2023, "Nissan"),
            new Car ("Р563ВВ", 2015, "Lada"),
            new Car ("В100КВ", 2018, "Mazda"),
            new Car ("К243ВН", 2002, "Chevrolet"),
            new Car ("С063КР", 2013, "Kia"));

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count > carList.size() || count < 1) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }


}
