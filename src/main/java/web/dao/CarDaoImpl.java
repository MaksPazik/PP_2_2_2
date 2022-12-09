package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private static final List<Car> cars = new ArrayList<>();

    {
        cars.add( new Car("model1","colour1", 111));
        cars.add( new Car("model2","colour2", 222));
        cars.add( new Car("model3","colour3", 333));
        cars.add( new Car("model4","colour4", 444));
        cars.add( new Car("model5","colour5", 555));
    }


    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
